package com.learning.core.day3;

import java.io.*;
import java.util.*;

public class D03P11 {
	
    static String encodeString(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        String res = "";
        int i = 0;
 
        // for each character in given string
        char ch;
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
 
            // If the character is occurring for the first
            // time, assign next unique number to that char
            if (!map.containsKey(ch))
                map.put(ch, i++);
 
            // append the number associated with current
            // character into the output string
            res += map.get(ch);
        }
 
        return res;
    }
    
    static void findMatchedWords(
            String[] dict, String pattern)
        {
            // len is length of the pattern
            int len = pattern.length();
     
            // encode the string
            String hash = encodeString(pattern);
     
            // for each word in the dictionary array
            for (String word : dict) {
                // If size of pattern is same
                // as size of current
                // dictionary word and both
                // pattern and the word
                // has same hash, print the word
                if (word.length() == len
                    && encodeString(word).equals(hash))
                    System.out.print(word + " ");
            }
        }

	public static void main(String[] args) {
		String[] dict = { "abb", "abc","xyz", "xyy" };
		String pattern = "foo";
		findMatchedWords(dict, pattern);
	}

}