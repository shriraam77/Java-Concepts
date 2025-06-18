package leetcode;

public class LengthOfLastWord {
	
/* 
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

*/
	 public static int lengthOfLastWord(String s) 
	 {
		 String strArr[]= null;
		 int length = 0;
		 strArr = s.trim().split(" ");
		 
		 for(int i = 0; i<strArr.length; i++)
		 {
			  length = (strArr[strArr.length-1]).length() ;
		 }
		 System.out.println(length);
		 return 0;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfLastWord("luffy is still joyboy	");
	}

}
