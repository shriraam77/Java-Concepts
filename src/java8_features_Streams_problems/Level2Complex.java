package java8_features_Streams_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Find the First String with Length > 5
Given a list of strings, find the first string whose length is > 5.
Return Optional<String> using findFirst().

Sum of Squares of Even Numbers
Given a list of integers, find the sum of squares of even numbers.
Example: [1,2,3,4] → even numbers [2,4] → squares [4,16] → sum 20.

Find the Longest String
Given List<String> words, use reduce to find the longest word.

Group Strings by Length
Given List<String> words, group them by their length using Collectors.groupingBy.
Result: Map<Integer, List<String>>.

Check if All Numbers are Positive
Given a list of integers, check using streams if all numbers are > 0.*/

public class Level2Complex {

	public static void main(String[] args) {

//1.
		List<String> str1 = Arrays.asList( "SPRING","HELLOOOO", "AUTO", "TABLE","ARREST");
		
		Optional result = str1.stream().filter(n -> n.length() < 5)
				.findFirst();
		
	//	System.out.println(result);
		
//2.
		
		
		
//3.	
		List<String> str2 = Arrays.asList( "SPRING","Hi", "AUTO", "TABLE","ARREST","HELLOOOO");	
		
		String longest = str2.stream().reduce("", (a,b)-> a.length() > b.length() ? a:b);
		
		System.out.println(longest);
	}

}
