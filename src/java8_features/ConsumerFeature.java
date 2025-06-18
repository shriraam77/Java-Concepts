package java8_features;

import java.util.function.Consumer;

public class ConsumerFeature {

	static void consumerMethod(Consumer<String> con)
	{
		con.accept("Shriraam");
	}
	
	public static void main(String[] args) {
		
		Consumer<String> c = (n)->
		{
			System.out.println("Consumer is called.....");
			System.out.println("Welcome Back "+n);
		};
		
		consumerMethod(c);

	}

}
