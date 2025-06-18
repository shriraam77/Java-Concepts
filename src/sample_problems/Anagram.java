package sample_problems;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "SHRI";
		String str2= "HSIR";
		
		char a[]= str1.toCharArray();
		char b[]= str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int count = 0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==b[i])
				count++;
		}
		if(count==a.length && count==b.length)
			System.out.println("Both are Anagram");
		else
			System.out.println("Both are not Anagram");
	}

}
