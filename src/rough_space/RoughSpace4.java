package rough_space;

public class RoughSpace4 
{
	public static String reverseWords(String s)
	{
		s = "cb ipctpyru  bovcbo";
		 s = s.trim();
		 System.out.println(s);
	       
	       String arr[]= s.split(" ");
	       StringBuilder sb = new StringBuilder();
	       
	       for(int i =arr.length-1; i>=0; i--)
	       {
	            sb.append(arr[i] + " ");
	       }
	       //cb ipctpyru  bovcbo
	       
	       System.out.println(sb.toString().trim());
	       
	       return s;
	}
	
	public static int lazyNumbers(int num)
	{
		// 1, 8, 10, 13
		
		
		
		return 0;
	}

	public static void main(String[] args) 
	{	
		reverseWords("hello");
	}
}
