package rough_space;

public class RoughSpace6 {

	// Method to check if a number is a lazy number
	public static boolean isLazyNumber(int number) {
		int sumOfSquares = 0;

		// Step 1: Square each digit and sum
		int temp = number;
		
		while (temp > 0) 
		{
			int digit = temp % 10;
			sumOfSquares += digit * digit;
			temp /= 10;
		}

		// Step 2: Reduce to single digit by summing digits repeatedly
		while (sumOfSquares >= 10) 
		{
			int digitSum = 0;
			
			while (sumOfSquares > 0) 
			{
				digitSum += sumOfSquares % 10;
				sumOfSquares /= 10;
			}
			
			sumOfSquares = digitSum;
		}

		// Step 3: Final digit must be 1
		return sumOfSquares == 1;
	}

	public static void main(String[] args) {

		int limit = 100; // Change this to any upper bound you want

//		System.out.println("Lazy numbers up to " + limit + ":");
//		
//		for (int i = 1; i <= limit; i++) 
//		{
//			if (isLazyNumber(i)) 
//			{
//				System.out.print(i + " ");
//			}
//		}

		System.out.println(isLazyNumber(10));
	}

}
