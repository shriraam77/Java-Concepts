package leetcode;

public class StringCompression {

	public static void main(String[] args) {
		
		String str = "aabccd";
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		for(int i=1; i< str.length(); i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				count++;
			}
			else 
			{
				sb.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		sb.append(str.charAt(str.length()-1)).append(count);
		
		System.out.println(count);
		
		System.out.println(sb.toString());

	}

}
