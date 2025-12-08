package java8_features_Streams_problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Level 1 – Basics
1.
Filter Even Numbers
Given List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

Use streams to get a list of even numbers.

2.
Convert to Uppercase
Given List<String> words = Arrays.asList("java", "spring", "boot");

Convert to ["JAVA", "SPRING", "BOOT"] using streams.

3.
Count Strings Starting with a Letter
Given a list of names, count how many start with the letter 'A'.

4.
Remove Duplicates
Given List<Integer> nums = Arrays.asList(1,2,2,3,3,3,4,5,5);

Produce a list of unique numbers using streams.

5.
Sort List of Strings by Length
Given List<String> cities = Arrays.asList("Chennai", "Goa", "Hyderabad", "Pune");

Sort them by length (ascending) using streams.
*/

public class Level1Basics {

	public static void main(String[] args) {

//	1.		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List <Integer> evenNums = nums.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		//System.out.println(evenNums);

//	2.
		List<String> words = Arrays.asList("java", "spring", "boot");
		
		//List<String> upperCase = words.stream().map(f-> f.toUpperCase()).collect(Collectors.toList());
		
		List<String> upperCase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		//System.out.println(upperCase);
		
//3.
		List<String> letterA = Arrays.asList("APPLE", "SPRING", "TABLE", "AUTO","ARREST");
		
		long countOfA = letterA.stream().filter(n -> n.startsWith("A")).count();
		
	//	System.out.println(countOfA);
		
//4.	
		List<Integer> dupNums = Arrays.asList(1,2,2,3,3,3,4,5,5);
		
		List<Integer> dupNums1 = dupNums.stream().distinct().collect(Collectors.toList());
		
	//	System.out.println(dupNums1);
		
//5.
		List<String> cities = Arrays.asList("Chennai", "Goa", "Hyderabad", "Pune");
		
		List<String> aescCities = cities.stream()
										.sorted(Comparator
												.comparingInt(n->n.length()))
										.collect(Collectors.toList());		
		System.out.println(aescCities);
	}

}
