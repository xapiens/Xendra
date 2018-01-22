// The contents of this file are subject to the Mozilla Public License Version
// 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo
// Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.frapuccino.addresscombobox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fdietz
 *  
 */
public final class TextParser {

	/**
	 * Get text between the first left occuring character ch and the cursor
	 * position pos including.
	 * 
	 * @param str
	 *            string
	 * @param ch
	 *            character
	 * @param pos
	 *            caret position
	 * @return
	 */
	public static String getTextRegion(String str, char ch, int pos) {

		int leftIndex = getLeftIndex(str, ch, pos);
		String result = str.substring(leftIndex, pos + 1);

		return result;
	}

	public static String getTextRegion(String str, Pattern separatorPattern, int pos) {

		int leftIndex = getLeftIndex(str, separatorPattern, pos);
		String result = str.substring(leftIndex, pos + 1);

		return result;
	}
	
	
	public static int getLeftIndex(String str, char ch, int pos) {
		return getLeftIndex(str, Pattern.compile("\\"+ch), pos);
	}
	
	/**
	 * Get index of first character occurences left to specified position.
	 * 
	 * @param str
	 *            string
	 * @param ch
	 *            character
	 * @param pos
	 *            starting position
	 * @return character position
	 */
	public static int getLeftIndex(String str, Pattern charPattern, int pos) {
		Matcher matcher = charPattern.matcher(str);		
		int index = 0;
		
		while( matcher.find() && matcher.end() <= pos) {
			index = matcher.end();
		}
		
		return index;
	}
	
	/**
	 * Get index of first character occurences right to specified position.
	 * 
	 * @param str
	 *            string
	 * @param ch
	 *            character
	 * @param pos
	 *            starting position
	 * @return character position
	 */
	public static int getRightIndex(String str, char ch, int pos) {
		return getRightIndex(str, Pattern.compile("\\"+ch), pos);
		
		/*
		// move one character left to the caret position
		int rightPos = pos;

		while (rightPos < str.length()) {
			// get character at position
			char c = str.charAt(rightPos);

			if (c == ch)
				break;

			rightPos++;
		}

		return rightPos;
		*/
	}

    @SuppressWarnings("empty-statement")
	public static int getRightIndex(String str, Pattern charPattern, int pos) {
		Matcher matcher = charPattern.matcher(str);		
		int index = pos;
		
		while( matcher.find() && matcher.start() <= pos);
		try {
			index = matcher.start();
		} catch(IllegalStateException e) {
			//Did not match anymore
			index = str.length();
		}
		
		return index;
	}
	
	
	/**
	 * Replace text in String between left and right position index.
	 * 
	 * @param str
	 *            string
	 * @param replace
	 *            replacement sring
	 * @param leftPos
	 *            left starting position
	 * @param rightPos
	 *            right finishing position
	 * @return modified string
	 */
	public static String replace(String str, String replace, int leftPos,
			int rightPos) {
		StringBuffer buf = new StringBuffer(str);

		if (leftPos > rightPos) {
			int helper = rightPos;
			rightPos = leftPos;
			leftPos = helper;
		}
		buf.delete(leftPos, rightPos);

		buf.insert(leftPos, replace);

		return buf.toString();
	}

	/**
	 * Replace text starting from first left occurence of character ending on
	 * right position.
	 * 
	 * @param str
	 *            string to modify
	 * @param replace
	 *            replacement string
	 * @param ch
	 *            matching character for left starting position
	 * @param rightPos
	 *            right position to start from
	 * @return return modified string
	 */
	public static String replace(String str, String replace, char ch,
			int rightPos) {
		return TextParser.replace(str, replace, TextParser.getLeftIndex(str, ch,
				rightPos) + 1, rightPos);
	}


	public static String replace(String str, String replace, Pattern separatorPattern,
			int rightPos) {
		return TextParser.replace(str, replace, TextParser.getLeftIndex(str, separatorPattern,
				rightPos) + 1, rightPos);
	}
	
	public static String getItemAt(String s, char ch, int pos) {
		
		int leftPos = getLeftIndex(s, ch, pos);
		int rightPos = getRightIndex(s,ch, pos);
		
		return s.substring(leftPos, rightPos);
	}

	public static String getItemAt(String s, Pattern separatorPattern, int pos) {
		
		int leftPos = getLeftIndex(s, separatorPattern, pos);
		int rightPos = getRightIndex(s,separatorPattern, pos);
		
		return s.substring(leftPos, rightPos);
	}

}