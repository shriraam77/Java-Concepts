package sample_problems;

import java.util.HashSet;
import java.util.Set;

public class DistintElements {

	 public static int common_digits(int[] nums) 
		{
			int x = -1 ;
		    for(int i = 0; i <nums.length; i++)
		    {
		    	if(!(x==nums[i]))
		    	{
		    		System.out.println(nums[i]);
		    		x= nums[i];
		    	}
		    }
		    return 0;    
		}
		 
		 public static int common_digits1(int[] nums) 
		 {
			 Set set = new HashSet<Integer>();
			 for(int i=0; i<nums.length; i++)
			 {
				 set.add(nums[i]);
			 }
			 System.out.println(set);
			 return 0;
		 } 
	
	public static void main(String[] args) 
	{

		int arr[] = {1,1,1,2,2,3,3,3,4};
		
		common_digits(arr);

	}

}
