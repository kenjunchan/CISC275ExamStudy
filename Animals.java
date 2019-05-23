package midterm1;
import java.util.*;
/*
 * Represent the following using classes, abstract classes and interfaces: 
 * Dogs, Fish, and BoxTurtles are all Animals. 
 * All swim except BoxTurtles. 
 * All Animals that can swim are classified as Swimmers
 * All Animals that can not swim are classified as NonSwimmers
 * Next, make a list containing all kinds of animals, fill it and print it; *using explicit iterators
 * then make a list of only animals that can swim. without using instanceOf
 * 
 * Then create a UML Diagram of these classes and interfaces
 */

class Main2 {
	public static void main(String [] args) {
		ArrayList<Animals> animals = new ArrayList<Animals>();
		animals.add(new Dogs());
		animals.add(new Fish());
		animals.add(new BoxTurtles());
		System.out.println(animals);

		//Remove all the NonSwimmers from the list using an explicit iterator
		//You may not make any additional Collections
		ArrayList<Animals> swimmers = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			swimmers.add(new Dogs());
			swimmers.add(new Fish());
			swimmers.add(new BoxTurtles());
		}
		System.out.println("Swimmers Before Removing: " + swimmers);
		//Begin writing code here
		
		System.out.println("Swimmers After Removing: " + swimmers);
		
	}
}