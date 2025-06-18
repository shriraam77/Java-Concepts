package rough_space;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RoughSpace3 {
	
	
	    int id;
	    String name;
	    String department;
	    double salary;

	    public RoughSpace3(int id, String name, String department, double salary) {
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
		
		List<RoughSpace3> empList = List.of(
			    new RoughSpace3(1, "Alice", "HR", 60000),
			    new RoughSpace3(2, "Bob", "Engineering", 80000),
			    new RoughSpace3(3, "Charlie", "HR", 40000),
			    new RoughSpace3(4, "David", "Engineering", 90000),
			    new RoughSpace3(5, "Eve", "Sales", 30000)
			);

		
		List<RoughSpace3> salary = 
				empList.stream()
				.filter( n -> n.getSalary() >50000 )
				.collect(Collectors.toList());
		
		System.out.println(salary);
		
		
		
		empList.stream()
		.map(s -> s.getName().toUpperCase())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		List<String> upperCase =
				empList.stream()
				.map(s -> s.getName().toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(upperCase);
		
		Optional opt =  empList.stream().max(Comparator.comparingDouble(n -> n.getSalary()));
		
		System.out.println("Highest paid");
		
		opt.ifPresent(i-> System.out.println(i));
	}

}
