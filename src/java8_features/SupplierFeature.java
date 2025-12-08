package java8_features;

import java.util.function.Supplier;

/*
 * Supplier - No parameter Passed
 */
public class SupplierFeature {
	
	static void methodCall(Supplier s)
	{
		s.get();
	}

	public static void main(String[] args) {

		Supplier<String> alert = ()->
		{
			System.out.println("Method call is Working....!!!");
			return "Alert Working";
		};
		
		methodCall(alert);
	}
}
