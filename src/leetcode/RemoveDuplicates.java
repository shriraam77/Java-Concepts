package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
public static int removeDuplicates(int[] nums) {
        
		Set s = new HashSet();
		for(int i= 0; i<nums.length;i++)
		{
			s.add(nums[i]);
		}
		System.out.println(s.size());
		System.out.println(s);
	
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//removeDuplicates(new int[] {1,1,2});
		removeDuplicates(new int[] {1,1,2});
	}

}
