package leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String s = "{}";
		
		Stack<Character> stack = new Stack();
		
		for(int i = 0; i<s.length() ; i++)
		{
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
			{
				stack.push(s.charAt(i));
			}
		sds	else
			{
				if( (stack.peek()== '{' && s.charAt(i)=='}') ||
						(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')'))
				{
					
				}
			}
			
		}

	}

}
