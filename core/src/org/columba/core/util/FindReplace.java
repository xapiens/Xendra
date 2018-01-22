/**
 * This file defines a class which implements the search 
 * and replace functionallity for a text. 
 * @author Dmytro Podalyuk, Matthias Buechler
 */
package org.columba.core.util;
import java.util.regex.*;

public class FindReplace {
	
	private Matcher m;
	private Pattern p;
	private boolean isFound; // is true if the last search was successful
	private int lastfoundposition; // a position of the word after the last search ivokation; -1 if nothing found
	private int lastreplaceposition; // a position of the word after the last replace ivokation; -1 if nothing was replaced
	
	private StringBuffer sb = null; //intern variable which is used for text replace purposes 
	
	private String pattern; // text which we are looking for, or want to replace
	private String replaceWith; // replaced text which we want to have  
	private String source; // text where we make a search
	private boolean casesensitive; // search/replace is case sensitive 
	private boolean matchwholeword; // search/replace matches whole words only
	private boolean backwards; // search/replace works backwards on the text
	
	private boolean processing = false; // false if search/replace is currently working
	
	public FindReplace(){  // constructor for the class
		pattern = new String();
		source = new String();
		replaceWith = new String();
		casesensitive = false;
		matchwholeword = false;
		backwards = false;
		
		isFound = false;
		lastreplaceposition = lastfoundposition = -1;
		
		m = null;
		p = null;
	}

	public FindReplace(String source, String pattern){ // some other version of the constructor
		this.pattern = pattern;
		this.source = source;
		this.replaceWith = new String();
		
		
		casesensitive = false;
		matchwholeword = false;
		backwards = false;
		
		isFound = false;
		lastreplaceposition = lastfoundposition = -1;
		m = null;
		p = null;
	}

	public FindReplace(String source, String pattern, String replaceWith){ // some other version of the constructor
		this.pattern = pattern;
		this.source = source;
		this.replaceWith = replaceWith;
		casesensitive = false;
		matchwholeword = false;
		backwards = false;
		
		isFound = false;
		lastreplaceposition = lastfoundposition = -1;
		m = null;
		p = null;
	}
	
	public void setSource(String source){
		this.source = source;
	}
	
	public String getSource(){
		return this.source;
	}

	public void setPattern(String pattern){
		this.pattern = pattern;
	}
	
	public String getPattern(){
		return this.pattern;
	}

	public void setReplaceWith(String replaceWith){
		this.replaceWith = replaceWith;
	}
	
	public String getReplaceWith(){
		return this.replaceWith;
	}
	
	
	public void setCaseSensitive(boolean state){
		this.casesensitive = state;
	}
	
	public boolean getCaseSensitive(){
		return this.casesensitive;
	}
	
	public void setMatchWholeWord(boolean state){
		this.matchwholeword = state;
	}
	
	public boolean getMatchWholeWord(){
		return this.matchwholeword;
	}

	public void setBackwards(boolean state){
		this.backwards = state;
		if (state && isFound) {
			lastfoundposition = source.length() - lastfoundposition;
			//if (lastreplaceposition != -1) lastreplaceposition = source.length() - lastreplaceposition;
		}
			
	}
	
	public boolean getBackwards(){
		return this.backwards;
	}

	// need to be called before search/replace to set up all the states we need
	private void begin() {
		if (!processing)
		{
			String source = this.source;
			String pattern = this.pattern;
			
			// find backwards
			if(backwards) {
				source = new StringBuffer(source).reverse().toString();
				pattern = new StringBuffer(pattern).reverse().toString();
				replaceWith = new StringBuffer(replaceWith).reverse().toString();
			}

			// match whole word
			if(matchwholeword) {
				// create pattern
				pattern = "\\b" + pattern + "\\b";
			}
	
			if(!casesensitive)
				p = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
			else
				p = Pattern.compile(pattern);

			m = p.matcher(source);
			processing = true;
		}
	}
	
	//	 need to be called after search/replace to make some changes in the states
	private void end(){
		if (processing){
			if(isFound) {
				if(backwards) {
					lastfoundposition = source.length() - m.end();
					//lastreplaceposition = lastfoundposition;
					
					replaceWith = new StringBuffer(replaceWith).reverse().toString();

					if (sb != null) {
						source = sb.reverse().toString();
						sb = null;
					}
					else
						source = new StringBuffer(m.toString()).reverse().toString();
	
				}
				else {
					lastfoundposition = m.start();
					//lastreplaceposition = lastfoundposition; //+ replaceWith.length();
					
					if (sb != null) {
						source = sb.toString();
						sb = null;
					}
					else
						source = m.toString();
				}
					
			}
			else
				lastfoundposition = -1;
			processing = false;
		}
	}
	
	// the implementation of the search function. It returns always the position of the FIRST found word.
	public int find() {
		begin();
			isFound = m.find(0);
		end();
		return lastfoundposition;
	}
	
	// the implementation of the search next function. It returns always the  position of the NEXT found word.	
	public int findnext() {
		// end of text was reached -> begin at the start
		begin();
			if(!isFound)
				find();
			else
				isFound = m.find(backwards?lastfoundposition:lastfoundposition+1);
		end();
		lastreplaceposition = -1;
		return lastfoundposition;
	}
	
	//	the implementation of the replace function. It returns always the  position of the NEXT replaced word.
	public int replace(){
		begin();
		//if (lastfoundposition == -1 || lastreplaceposition == -1) {lastreplaceposition = lastfoundposition = 0;}
		
		if (lastfoundposition == -1) lastfoundposition = 0;
		
		if (lastreplaceposition == -1 && backwards) {
			lastreplaceposition = lastfoundposition - pattern.length();
			if (lastreplaceposition <0) lastreplaceposition = 0;
		}
		
		if (lastreplaceposition == -1 && !backwards) lastreplaceposition = lastfoundposition;
		if (lastreplaceposition == -2 && backwards) lastreplaceposition = lastfoundposition;
		if (lastreplaceposition == -2 && !backwards) lastreplaceposition = lastfoundposition+replaceWith.length();
		
		isFound = m.find(lastreplaceposition);
		if (isFound) {
			sb = new StringBuffer();
			 
			m.appendReplacement(sb, replaceWith);
			m.appendTail(sb);
			lastreplaceposition = -2;
		}
		else
			lastreplaceposition = -1;
		
		end();
		return lastfoundposition;
	}
	
	//	the implementation of the replace all function.
	public void replaceAll(){
		begin();
			String source = m.replaceAll(replaceWith);
			if (source != null)
				if (backwards) this.source = new StringBuffer(source).reverse().toString();
				else
					this.source = source;
		isFound = false;
		end();
	}
}
