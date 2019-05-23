package midterm1;
import java.util.*;

interface Movers2{
	public void move();
}

class Person {
	String name;
	int age;
	Person(String name, int age){
		//Why are we using the keyword "this" here?
		this.name = name;
		this.age = age;
	}
}

class Main{
	public static void main(String[]args) {
		//modify the following code to make the code compile
		ArrayList<Person> movers = new ArrayList<>();
		movers.add(new Person("Jane", 5));
		movers.add(new Person("Mary", 7));
		movers.add(new Person("Anna", 2));
		movers.add(new Person("Chelsea", 9));
		movers.add(new Person("Sam", 10));
		
		//What is the "natural order" in java
		
		//sort using an in-line Comparator in ascending order
		
		//modify the code to include a toString method that prints out the name followed by the age of the Person [Bob, 8]
		
		//print the Collection using an explicit iterator
		
		//comment out the in-line Comparator and instead sort by using Comparable in ascending order
	}
}
