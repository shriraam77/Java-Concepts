package java8_features;

import java.util.function.Function;

/*
 * Function - one parameter is passsed
 */
public class FunctionFeature {
	
	static void method(Function<String,?> f)
	{
		f.apply("Shriraam");
	}
	
	static int length(Function<String,Integer> f)
	{
		return f.apply("Shriraam");
	}

	
	public static void main(String[] args) {

//1.	
		Function<String, ?> f = (n) ->
		{
			System.out.println("Helloo "+n);
			return 0;
		};
		
		Function<String, ?> f2 = (n) ->
		{
			System.out.println("Helloo "+n);
			return 0;
		};
		
		method(f);
		
//2.	
		Function<String,Integer> f1 = (x)->
		{
			return x.length();
		};
		
		//f.andThen(f2).apply("hellp");
		
		System.out.println( length(f1) );

	}

}
