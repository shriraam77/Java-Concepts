package java8_features;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateBiPredicateFeature {
	
	static void evenNumCheck(Predicate<Integer> p)
	{
		if(p.test(55))
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
	
	static void StringCompare(BiPredicate<String,String> b)
	{
		if(b.test("Hello", "HeLLo"))
			System.out.println("Both are equals");
		else
			System.out.println("Both are false");
	}

	public static void main(String[] args) 
	{

		Predicate<Integer> p = (n)->{
			
			if(n%2==0)
				return true;
			else
				return false;
		};
		
		BiPredicate<String, String> bp = (a,b)->
		{
			if(a.equalsIgnoreCase(b))
				return true;
			else
				return false ;
		};
		
		evenNumCheck(p);
		
		StringCompare(bp);

	}

}
