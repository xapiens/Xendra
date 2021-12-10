/*
 * Copyright (c) 2008, 2010, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.xendra.utils;

import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;
import java.io.*;
import java.util.*;

import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.xendra.Constants;
import org.xendra.xendrian.Plugin;
import org.xendra.xendrian.SyncModel;

/**
 * Example to watch a directory (or tree) for changes to files.
 */

public class WatchDir implements Runnable {

    private final WatchService watcher;
    private final Map<WatchKey,Path> keys;    
    private boolean trace = false;
    //private File dirstore;
    private Path pathstore;
	private boolean m_syncro = false;
    @SuppressWarnings("unchecked")
    static <T> WatchEvent<T> cast(WatchEvent<?> event) {
        return (WatchEvent<T>)event;
    }

    /**
     * Register the given directory with the WatchService
     */
    private void register(Path dir) throws IOException {
        WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        if (trace) {
            Path prev = keys.get(key);
            if (prev == null) {
                System.out.format("register: %s\n", dir);
            } else {
                if (!dir.equals(prev)) {
                    System.out.format("update: %s -> %s\n", prev, dir);
                }
            }
        }
        keys.put(key, dir);
    }
    
    /**
     * Creates a WatchService and registers the given directory
     * @param syncro 
     */
    public WatchDir() throws IOException {
    	X_A_Machine machine = Env.getMachine();
    	HashMap props = machine.getProperties();    	
    	//dirstore = new File((String) props.get(Constants.STORE));
    	//pathstore = Paths.get(dirstore.getAbsolutePath());
    	pathstore = Paths.get(Env.getMachine().getStoreFolder().getAbsolutePath());
        this.watcher = FileSystems.getDefault().newWatchService();
        this.keys = new HashMap<WatchKey,Path>();
        register(pathstore);
        // enable trace after initial registration
        this.trace = true;
    }

    public void setSyncronized(boolean syncro) {
    	m_syncro = syncro;
    }
    /**
     * Process all events for keys queued to the watcher
     */
    public void processEvents() {
        for (;;) {

            // wait for key to be signalled
            WatchKey key;
            try {
                key = watcher.take();
            } catch (InterruptedException x) {
                return;
            }

            Path dir = keys.get(key);
            if (dir == null) {
                System.err.println("WatchKey not recognized!!");
                continue;
            }
            for (WatchEvent<?> event: key.pollEvents()) {
                WatchEvent.Kind kind = event.kind();

                // TBD - provide example of how OVERFLOW event is handled
                if (kind == OVERFLOW) {
                    continue;
                }

                // Context for directory entry event is the file name of entry
                WatchEvent<Path> ev = cast(event);
                Path name = ev.context();
                Path child = dir.resolve(name);

                // print out event
                System.out.format("%s: %s\n", event.kind().name(), child);

                if (kind == ENTRY_CREATE || kind == ENTRY_MODIFY) {
                	//try {
                	//	Thread.sleep(1000);
                	//} catch (Exception e) {}
                    if (dir.equals(pathstore))
                    {
                    	if (name.toString().endsWith(".zip")) {
                    		Boolean complete = false;                    		
                    		long length = -1;
                    		try {                    			
                    			while (!complete) {
                            		File f = new File(dir.toFile(), name.toString());                            		
                            		if (length == f.length())
                            			complete = true;              
                            		length = f.length();
                    			}
                    		} catch (Exception e) {
                    			
                    		}                  
                    		
                    	}
                    	if (name.toString().endsWith(".zip"))
                    	{
                    		try {
                    			Plugin.getInstance().deployplugins();
                    			if (m_syncro)
                    				SyncModel.getInstance().SyncronizeLight();
                    			// fill the tables with info of replication
                    			SyncModel.getInstance().Replication();
                    			// after the fill check to update/create some config
                    			Plugin.getInstance().afterReplication();
                    		}
                    		catch (Exception e)
                    		{
                    			e.printStackTrace();
                    		}
                    	}
                    }
                }
                // if directory is created, and watching recursively, then
                // register it and its sub-directories
//                if (recursive && (kind == ENTRY_CREATE)) {
//                    try {
//                        if (Files.isDirectory(child, NOFOLLOW_LINKS)) {
//                            registerAll(child);
//                        }
//                    } catch (IOException x) {
//                        // ignore to keep sample readbale
//                    }
//                }
            }

            // reset key and remove from set if directory no longer accessible
            boolean valid = key.reset();
            if (!valid) {
                keys.remove(key);

                // all directories are inaccessible
                if (keys.isEmpty()) {
                    break;
                }
            }
        }
    }

    static void usage() {
        System.err.println("usage: java WatchDir [-r] dir");
        System.exit(-1);
    }

    public static void main(String[] args) throws IOException {
        // parse arguments
        if (args.length == 0 || args.length > 2)
            usage();
        boolean recursive = false;
        int dirArg = 0;
        if (args[0].equals("-r")) {
            if (args.length < 2)
                usage();
            recursive = true;
            dirArg++;
        }

        // register directory and process its events
        Path dir = Paths.get(args[dirArg]);
        new WatchDir().processEvents();
    }

	@Override
	public void run() {						
		Thread.currentThread().setName("waiting plugins");
		processEvents();
	}
}
