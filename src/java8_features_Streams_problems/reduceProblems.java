package java8_features_Streams_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class reduceProblems {

	public static void main(String[] args) {

		/*
		 * 1. Sum of integers (easy)
		 * Input: List<Integer> nums = Arrays.asList(1,2,3,4,5);
		 * Output: 15
		 */
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		int sum = nums.stream().reduce(0, (a,b)-> a+b);
		// System.out.println(sum);
		
		/*
		 * 2. Product of integers (easy)
		 * Input: [2,3,4]
		 * Output: 24
		 */
		
		List<Integer> nums1 = Arrays.asList(2,3,4);
		int product = nums1.stream().reduce(1, (a,b) -> a*b );
		//System.out.println(product);
		
		/*
		 * 3. Sum of squares of numbers (easy-medium)
		 * Input: [1,2,3]
		 * Output: 14 (1² + 2² + 3²)
		 */
		
		List<Integer> nums2 = Arrays.asList(1,2,3);
		int sqr = nums2.stream().reduce(0, (a,b) -> a + (b*b) ) ;
	//	System.out.println(sqr);
		
		/*
		 * 4. Concatenate strings (easy)
		 * Input: ["a","b","c"]
		 * Output: "abc"
		 */
		
		List<String> str1 = Arrays.asList("a","b","c");
		String res1 = str1.stream().reduce("", (a,b) -> a+b);
	//	System.out.println(res1);
		
		/*
		 * 5. Longest string (medium)
		 * Input: ["java", "spring", "go", "microservices"]
		 * Output: "microservices"
		 */
		
		List<String> str2 = Arrays.asList("java", "microservicess", "go", "microservices");
		String longest = str2.stream().reduce("", (a,b) -> a.length() > b.length() ? a:b);
//		System.out.println(longest);
		
		/*
		 * 6. Find maximum (medium)
		 * Input: [5, 3, 9, 1]
		 * Output: 9
		 */
		
		List<Integer> nums3 = Arrays.asList(5, 3, 9, 1);
		int max = nums3.stream().reduce(0, (a,b) -> a > b ? a : b );
		System.out.println(max);
		
		
		// STRUCKED
		/*
		 * 7. Merge two maps summing values (medium-hard)
		 * 
		 * Input: List<Map<String,Integer>> like [{a:2,b:1}, {a:3,c:5}, {b:2}]
		 * 
		 * Output: single map {a:5, b:3, c:5}
		 */
		
		List<Map<String, Integer>> myData = List.of(
			    Map.of("a", 2, "b", 1),
			    Map.of("a", 3, "c", 5),
			    Map.of("b", 2, "c", 1)
			);
		// ??
		Map<String, Integer> map = myData.stream().reduce(null, null);
		
		/*
		 * 7. Merge two maps summing values (medium-hard)
		 * 
		 * Input: List<Map<String,Integer>> like [{a:2,b:1}, {a:3,c:5}, {b:2}]
		 * 
		 * Output: single map {a:5, b:3, c:5}
		 * 
		 * Hint: reduce two maps into one by merging each entry; for merging use
		 * map.merge(key, value, Integer::sum) inside accumulator.
		 * 
		 * 8. Weighted average (hard)
		 * 
		 * Input: list of Pair<Double value, Double weight>; compute weighted average =
		 * sum(value*weight)/sum(weight)
		 * 
		 * Output: a double result
		 * 
		 * Hint: reduce to a double[] {sumWeighted, sumWeight} then compute ratio after
		 * terminal op.
		 * 
		 * 9. Combine Optional values (hard)
		 * 
		 * Input: List<Optional<Integer>> like [Optional.of(1), Optional.empty(),
		 * Optional.of(3)]
		 * 
		 * Output: Optional<Integer> containing sum 4 (or Optional.empty() if all empty)
		 * 
		 * Hint: flatten optionals or use map(Optional::orElse).reduce(...) carefully;
		 * better: stream().flatMap(o ->
		 * o.map(Stream::of).orElseGet(Stream::empty)).reduce(...) (or collect then
		 * reduce).
		 * 
		 * 10. Parallel-safe string join with reduce (advanced)
		 * 
		 * Input: large List<String> words
		 * 
		 * Output: a single joined string with commas "w1,w2,w3,..."
		 * 
		 * Hint: for parallel streams use reduce(identity, accumulator, combiner) form
		 * (three-arg reduce) to correctly combine partial results in parallel — or
		 * prefer Collectors.joining() normally. Example three-arg reduce:
		 * 
		 * identity: new StringBuilder()
		 * 
		 * accumulator: (sb, s) -> sb.append(s).append(",")
		 * 
		 * combiner: (sb1, sb2) -> sb1.append(sb2)
		 * 
		 * remember to remove trailing comma if needed.
		 */
		
	}

}
