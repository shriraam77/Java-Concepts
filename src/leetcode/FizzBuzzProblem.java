package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzProblem {

	public static void main(String[] args) {

		int n = 15;
		
		List<String> ls = new ArrayList();
		
		for(int i =1; i <= n;i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
				ls.add("FizzBuzz");
			
			else if(i%3==0)
				ls.add("Fizz");
			
			else if(i%5==0)
				ls.add("Buzz");
			
			else
				ls.add(i+"");
		}
		
		System.out.println(ls.toString());

	}

}
