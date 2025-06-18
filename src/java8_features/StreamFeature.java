package java8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFeature {
	
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Apple", "Avacado","Grapes", "Guava", "Hello", "Web");
		
		
		System.out.println("1.\n");
//filter - boolean predicate, for Each - void Consumer
		names.stream()
		.filter(n->n.startsWith("A"))
		.forEach(System.out::println);
		
//collect - Collectors
		System.out.println("2.\n");
		names.stream()
		.filter( x->x.length()<=5)
		.collect(Collectors.toList());  // lambda expression
		
		System.out.println("3.\n");
// map - Function 
		names.stream()
		//.map(n -> n.toUpperCase())
		.map(String::toLowerCase)
		.forEach(System.out::println);;
		
		System.out.println("4.\n");
//sorted - no args
		names.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		
		
	}
}
