package leetcode;

import java.util.HashMap;
import java.util.Map;

/*

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

*/

public class TwoSum {
	
	public static int[] twoSum(int num[], int target)
	{
		//2,7,11,15 - target - 9
		int result = 0;		
		Map map = new HashMap();
		
		for(int i = 0; i<num.length; i++)
		{
			result = target-num[i];
			if(map.containsKey(result))
			{
				return new int [] {result,num[i]};
			}
			map.put(num[i], i);
		}
		
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(twoSum(new int[] {2,7,11,15}, 9));
		//System.out.println(twoSum(new int[] {3,2,4}, 6));
		int answer[] = twoSum(new int[] {2,7,11,15}, 9);
		//int answer[] = twoSum(new int[] {3,2,4}, 6);
		System.out.println(answer[0]+","+answer[1]);
	}

}
