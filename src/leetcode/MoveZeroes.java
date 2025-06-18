package leetcode;

public class MoveZeroes {

	public static void main(String[] args) {

		int nums[] = {0,1,0,3,12} ;
		
//		for(int i=0; i<nums.length; i++)
//		{
//			if()
//		}
		
		int left  = 0;
		int right = nums.length-1 ;
		int temp = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]!=0)
				nums[temp++] = nums[i];
		}
		
		while(temp<nums.length)
		{
			nums[temp++] = 0;
		}
		
		for(int i:nums)
			System.out.println(i);

	}

}
