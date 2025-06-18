package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
	
	/*
	 * Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
	 */
	
	 public String longestCommonPrefix(String[] strs) 
	 {
		 Map m = new HashMap<>();
		 
		 char[] strArr = null;
		 for(int i=0; i<strs.length;i++)
		 {
			 char[] prevArr = strArr;
			 strArr = strs[i].toCharArray();
			 
			 m.put(i, strArr);
			 
			 if(i!=0)
			 {
				 for(int j=0; j<strArr.length; j++)
				 {
					 if(strArr[i]== m.get(i)[i])
					 {
						 
					 }
				 }
			 }
		 }
	     return "";   
	 }

	public static void main(String[] args) 
	{
		
		

	}

}
