package gfg_problems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DistinctDigitArray {
	
	public static int[] common_digits(int[] nums) 
	{
	    int result[] = null;  
		//in
		String eachNum = "";
		Set set =  new HashSet() ;
		for(int i = 0; i < nums.length; i++) 
		{
			eachNum = nums[i]+"";
			for(int j = 0 ; j<eachNum.length(); j++)
			{
				set.add(eachNum.charAt(j));
			}
		}
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	    return result;    
	}

	public static void main(String[] args) {

		int arr[] = {11,123,553,6278};

		common_digits(arr);

	}

}
