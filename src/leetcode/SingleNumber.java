package leetcode;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,4,8,1,2,1,2};
		int result = 0;
		
		for(int i =0; i<nums.length; i++)
		{
			result = result ^ nums[i];
		}
		System.out.println(result);
	}

}
