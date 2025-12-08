package rough_space;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoughSpace5 {
	
	public static void main(String[] args) 
	{

		String zip1 = "BT34 3RS";
		String zip2  ="BT4 2AX";
		
		String zip3 = "14 5BT";
		
		String zip4 = "BTK14 5T";
		
		if(zip4.contains("BT"))
			System.out.println("True 1");
		else
			System.out.println("False");


		if(zip3.trim().startsWith("BT"))
			System.out.println("True2");
		else
			System.out.println("False 2");
		
	}
}
