/*
## Name of the problem
3. Longest Substring Without Repeating Characters

## Description

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

## Link
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

*/


class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        
        // Initializing loop variables
        // max is the length of the Longest Substring
        int i = 0, j = 0, max = 0;

        // Using hashset to store the Longest Substring Without Repeating Characters
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
        	// if the character not in the hashset
            if (!set.contains(s.charAt(j))) {
            	// adding the character in the hashset
                set.add(s.charAt(j++));
                // calculating the length of the substring
                // by maximizing the max and size of the hashset
                max = Math.max(max, set.size());
            } else {
            	// Remove the character from the hashset 
            	// if the character already is in the hashset
                set.remove(s.charAt(i++));
            }
        }

        return max;
        
    }
}