package java8_features_Streams_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingProblems {

	public static void main(String[] args) {
		
		/*
		 * 1. Group strings by first character (easy)
		 * Input: ["apple","ant","banana","ball"]
		 * Output: { 'a' -> ["apple","ant"], 'b' -> ["banana","ball"] }
		 * Hint: groupingBy(s -> s.charAt(0)).
		 */
		
		List<String> str1 = Arrays.asList("apple","ant","banana","ball");
		Map<Character, List<String>> m = str1.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
		//System.out.println(m);
		
		/*
		 * 2. Word frequency count (easy)
		 * 
		 * Input: ["apple","banana","apple","orange","banana","apple"]
		 * 
		 * Output: {apple=3, banana=2, orange=1}
		 */
		
		List<String> str2 = Arrays.asList("apple","banana","apple","orange","banana","apple");
		

		Map<String, Long> m12 = str2.stream().collect(Collectors.groupingBy( a -> a , Collectors.counting() )) ;
		
		
		
		
		
		
		
		
		
Map<Object, Long> m1 = str2.stream().collect(Collectors.groupingBy(a -> a,Collectors.counting()));
		
		System.out.println(m1);

	}

}
