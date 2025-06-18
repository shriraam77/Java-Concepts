package dsa_search_algo;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int target)
	{
		//1,3,8,15,22
		int left  = 0;
		int right = arr.length-1 ;
				
		while(left <= right)
		{
			int mid	  = (left + right) / 2;
			
			if(arr[mid] == target)
				return mid;
			
			else if(arr[mid] < target)
				left = mid+1;
			
			else 
				right = mid-1;
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int arr[], int target, int left, int right)
	{
		//1,3,8,15,22
				
		if(left <= right)
		{
			int mid	  = (left + right) / 2;
			
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] < target)
				recursiveBinarySearch(arr,target,mid+1,right);
			else 
				recursiveBinarySearch(arr,target,left,mid-1);
		}
		return -1;
	}
	
	public static int MyBinarySearch(int arr[], int target)
	{
		//1,3,8,15,22
		int left  = 0;
		int right = arr.length-1 ;
				
		while(left <= right)
		{
			int mid	  = (left + right) / 2;
			
			if(arr[mid] == target)
				return mid;
//			else if(arr[left]==target)
//			{
//				return left;
//			}
//			else if(arr[right]==target)
//			{
//				return right;
//			}
			else if(arr[mid] < target)
				left = mid+1;
			else 
				//if(arr[mid] > target) 
			{
				right = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,8,15,22,26,27,95,96,98,99,100};
		int target= 100;
		
		int result = binarySearch(arr, target);
		System.out.println("result: "+result);
	}

}
