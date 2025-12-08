package rough_space;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person {
	
	String name;
	int age;
	
	Person(String name, int age) 
	{
		this.name = name; this.age = age;
	}
}

public class RoughSpace1 {

	public static void main(String[] args) {
		
//		List<Integer> ls = new ArrayList<Integer>();
//		List<Integer> res = new ArrayList<Integer>();
//		
//		ls.add(2);
//		ls.add(1);
//		ls.add(5);
//		ls.add(4);
//		ls.add(11);
//		ls.add(9);
//		ls.add(16);
//		
//		res=ls.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
//		System.out.println(ls);
//		System.out.println(res);
		
		
		List<String> ls1 = new ArrayList<String>();
		List<String> res1 = new ArrayList<String>();
		
		ls1.add("Apple");
		ls1.add("Orange");
		ls1.add("MANGO");
		ls1.add("LiMe");
		ls1.add("pOmO");
		
//		res1 = ls1.stream().map(n-> n.toUpperCase()).collect(Collectors.toList());
//		res1 = ls1.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		Function<String,String> revFunc = (n) ->
		{
			String str = "";
//			for(int i = n.length()-1 ; i > n.length() ; i--)
//			{
//				str += n.charAt(i);
//			}
			
			for(int i=0; i< n.length(); i++)
			{
				str+= "_" + n.charAt(i);
			}
			
			return str;
		};

		res1 = ls1.stream().map(revFunc).collect(Collectors.toList());
		
		System.out.println(res1);
		
		
	}

}
