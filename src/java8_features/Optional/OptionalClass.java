package java8_features.Optional;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		Optional<Cat> c = getCat("Fred");
		
		Cat optionalCat = c.orElse(new Cat("ERROR",0));
		c.map(Cat::getAge);
		
		System.out.println(c.get().getAge());

	}
	
	private static Optional<Cat> getCat(String name)
	{
		Cat c = new Cat(name,3);
		return Optional.ofNullable(c);  // to check for null check
		//return Optional.of(c);		  // will not null check
		//return Optional.empty();		  // to create empty optional Box
	}
}
