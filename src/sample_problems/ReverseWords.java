package sample_problems;

public class ReverseWords {

	public static void main(String[] args) {
		
		String str = " hello everyone thank you ";
		
		String result = "";
		
		str = str.trim();
		
		String arr[] = str.split(" ");
		
		for(int i= arr.length-1 ; i >= 0;i--)
		{
			result += arr[i]+" ";
		}
		
		System.out.println(result);

	}

}
