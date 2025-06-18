package java8_features;

import java.util.function.BiFunction;

public class BiFunctionFeature {
	
	static int AddUsingBiFunc(BiFunction<Integer, Integer, Integer> b)
	{
		return b.apply(7, 9);
	}

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer , Integer> bf = (m,n)->
		{
			return m + n;
		};
		
		System.out.println( AddUsingBiFunc(bf) );
	}

}
