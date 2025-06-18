package java8_features;

import java.util.function.BiConsumer;

public class BiConsumerFeature {
	
	static void methodCall(BiConsumer<Integer,Integer> bi)
	{
		bi.accept(8, 6);
	}

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> bc = (i,j)->
		{
			System.out.println(i*j);
		};
		
		methodCall(bc);
	}
}
