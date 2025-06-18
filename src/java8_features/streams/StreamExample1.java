package java8_features.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample1 {
	
	    int id;
	    String name;
	    String department;
	    double salary;

	    public StreamExample1(int id, String name, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    public String toString() {
	        return id + " - " + name + " - " + department + " - $" + salary;
	    }

	    // Getters (required for streams and collectors)
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public String getDepartment() { return department; }
	    public double getSalary() { return salary; }

	
	public static void main(String[] args) 
	{
		
		List<StreamExample1> empList = List.of(
			    new StreamExample1(1, "Alice", "HR", 60000),
			    new StreamExample1(2, "Bob", "Engineering", 80000),
			    new StreamExample1(3, "Charlie", "HR", 40000),
			    new StreamExample1(4, "David", "Engineering", 90000),
			    new StreamExample1(5, "Eve", "Sales", 30000)
			);
		
//1 - Get a list of employees with salary > 50,000.
		System.out.println("1. ");
		List<StreamExample1> salary = 
				empList.stream()
				.filter( n -> n.getSalary() >50000 )
				.collect(Collectors.toList());
		
		System.out.println(salary);
		
// 2.  Convert all employee names to uppercase.
		System.out.println("\n2.");
		empList.stream()
		.map(s -> s.getName().toUpperCase())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
// 3. 	Convert all employee names to uppercase in a List
		System.out.println("\n3.");
		
		List<String> upperCase =
				empList.stream()
				.map(s -> s.getName().toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(upperCase);
		
//	5.	Find the highest-paid employee.	
		Optional<StreamExample1> opt =  empList.stream().max(Comparator.comparingDouble(n -> n.getSalary()));
		
		System.out.println("\n4.");
		System.out.println("Highest paid");
		opt.ifPresent(i-> System.out.println(i));
		
		
//	6. Group By Department 
		Map<String, List<StreamExample1>> byDept = empList.stream()
			    .collect(Collectors.groupingBy(StreamExample1::getDepartment));

			System.out.println("Grouped by department:");
			byDept.forEach((dept, emps) -> {
			    System.out.println(dept + ":");
			    emps.forEach(System.out::println);
			});

		
//	6.   
	//	List depart = empList.stream().
		
		
	}

}
