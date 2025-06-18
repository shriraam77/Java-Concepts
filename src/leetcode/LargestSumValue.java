package leetcode;

public class LargestSumValue {

	public static int largestSum(int num[])
	{
		// 0,5,3,12,2,11,6
		int result = 0;
		int answer = 0;
		
		for(int i = 0; i< num.length-1; i++)
		{
			result = num[i]+num[i+1];
			if(result>answer)
				answer = result;
		}
		return answer;
	}
	
	public static void main(String[] args) {

		System.out.println(largestSum(new int[] {0,5,7,12,2,11,6}));

	}

}
