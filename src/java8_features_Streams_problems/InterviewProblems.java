package java8_features_Streams_problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewProblems {
	
	public static void main(String[] args) {
		
		List<Student> list = Stream.of(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());
		
	     // 1. Find the list of students whose rank is in between 50 and 100
        //2. Find the Students who stays in Karnataka and sort them by their names
        // 3. Find all departments names
        //4.  Find all the contact numbers
        //5.  Group The Student By Department Names
        //6. Find the department who is having maximum number of students
        //7. Find the average age of male and female students
        //8. Find the highest rank in each department
        //9 .Find the student who has second rank
		
		// 1. Find the list of students whose rank is in between 50 and 100		
		List<Student>answer1 = list.stream().filter(n -> n.getRank() > 50 && n.getRank()< 100 ).collect(Collectors.toList());
	//	System.out.println(answer1);
		
		//2. Find the Students who stays in Karnataka and sort them by their names
		List answer2 = list.stream().filter(n -> n.getCity().equalsIgnoreCase("Karnataka"))
									.sorted(Comparator.comparing(Student::getFirstName)
						//					.reversed()		// to dislay in descending Order
											)	
									.collect(Collectors.toList());
	// System.out.println(answer2);
		
		// 3. Find all departments names
		
	//	List answer3 = list.stream().map(n -> n.getDept()).distinct().collect(Collectors.toList()) ;
		
		List answer3 = list.stream().map(Student::getDept).distinct().collect(Collectors.toList()) ;
	//	System.out.println(answer3);
		
		
		//4.  Find all the contact numbers
		//List answer4 = list.stream().map(Student::getContacts).collect(Collectors.toList()) ;
		List answer4 = list.stream().flatMap(s -> s.getContacts().stream()).collect(Collectors.toList()) ;
		//System.out.println(answer4);
		
		//5.  Group The Student By Department Names
		//Map answer5 = list.stream().collect(Collectors.groupingBy(d -> d.getDept() ));
	//	Map answer5 = list.stream().collect(Collectors.groupingBy(Student::getDept));
		
		Map answer5 = list.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting()));
	//	System.out.println(answer5);
		
		
		// 6. Find the department who is having maximum number of students
		
	//	String departMax = list.stream().reduce("",(a,b) -> a.getFirstName() > );
		
		//7. Find the average age of male and female students
		
		Map average = list.stream().collect(
											Collectors.groupingBy(Student::getGender, 
																  	Collectors.averagingDouble(Student::getAge)
																  )
											);
	//	System.out.println(average);
		
		//8. Find the highest rank in each department
		
		Map highest = list.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))  )
											);
	//	System.out.println(highest);
		
		//9 .Find the student who has second rank  -- important
		
		Student sorted = list.stream()
							.sorted(Comparator.comparing(Student::getRank)).skip(1)
							.findFirst().get();
						//	.collect(Collectors.toList());
		
		System.out.println(sorted);
	}

}
