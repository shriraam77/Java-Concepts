package gfg_problems;

import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {
//	s = aaaabbbccc
//	Output: a4b3c3

	public static String encode(String s) {
		// code here
		s = "aaaabbbccc" ;
		char c[] = s.toCharArray();
		char curr = ' ' ;
		char prev = ' ' ;
		int count = 0;
		Map h = new HashMap();
		
		for(int i=0; i< c.length;i++)
		{
			curr = c[i];
			if(curr!=prev)
			{
				++count;
			}
			else
			{
				a=c[i];
				if(a==c[i])
				{
					++count;
				}
			}
		}
		

		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
