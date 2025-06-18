package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

// - Longest Substring without repeating characters

public class LongestSubString {

	//Normal Method
	public static int longestSubStringNoRepeatingChars(String str)
	{
		// a b c b c
		// a b c b d 
		int length = 0;
		char c ;
		Map<Character,Integer> charMap = new LinkedHashMap();
		
		for(int i=0; i <str.length(); i++)
		{
			c = str.charAt(i);
			
			if(!charMap.containsKey(c))
			{
				charMap.put(c, i);
			}
			else
			{
				charMap.clear();
			}
			if(charMap.size() > length)
			{
				length = charMap.size();
			}
		}
		
			System.out.println(charMap.keySet().toString());
			System.out.println(length);
		
//		System.out.println(length);
//		System.out.println(charMap.keySet().toString());
		
		return 0;
	}
	
	//Sliding Window
	
	public static void main(String[] args) {

		longestSubStringNoRepeatingChars("b");

	}

}
