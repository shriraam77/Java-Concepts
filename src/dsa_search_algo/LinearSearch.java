package dsa_search_algo;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]  = {1,3,4,6,9,12,14,34};
		int target = 1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				System.out.println(i);
			}
		}

	}

}
