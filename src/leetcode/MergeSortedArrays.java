package leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {

		int num1[] = {1,2,5,7,0,0}, num2[] = {2,3,6};
		
		int num2Pntr = num2.length-1, num1Pntr = num1.length-1;
		
		while(num2Pntr > 0)
		{
			if(num2[num2Pntr] > num1[num1Pntr])
			{
				num1[num1Pntr] = num2[num2Pntr];
				System.out.println(num1Pntr);
				System.out.println(num2Pntr);
			}
			else 
			{
				num2Pntr = num2Pntr-1;
				num1Pntr = num1Pntr-1;
				System.out.println("In else");
				System.out.println(num1Pntr);
				System.out.println(num2Pntr);
			}
		}
		fsdf
		System.out.println("result");
		Arrays.sort(num1);
		
		for(int i:num1)
		{
			System.out.println(i);
		}

	}

}
