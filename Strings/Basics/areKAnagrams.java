// Java program to check if two strings are k anagram
// or not.

import java.io.*;
import java.util.*;

class GFG {
	public static boolean areKAnagrams(String s1, String s2, int k)
	{
		// code here
		if (s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (map.getOrDefault(ch, 0) > 0) {
				map.put(ch, map.get(ch) - 1);
			}
		}

		int count = 0;
		for (char ch : map.keySet()) {
			count += map.get(ch);
		}

		if (count > k)
			return false;
		else
			return true;
	}
	public static void main(String[] args)
	{
		String str1 = "abcd";
		String str2 = "bceb";
		int k = 2;
		if (areKAnagrams(str1, str2, k))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
// This code is contributed by Raunak Singh
