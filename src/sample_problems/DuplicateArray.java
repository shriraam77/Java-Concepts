package sample_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateArray {

	public static void main(String[] args) {

		//Map<String, String> conHash =  new ConcurrentHashMap<>();
		
		String str = "aeioueuo";
		
		str = str.toLowerCase();
	
		
		int count = 0;
		
		for(int i = 0 ; i < str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
