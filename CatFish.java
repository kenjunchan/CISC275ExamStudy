package midterm1;
import java.util.*;

interface Movers{
	public void move();
}

class Cat implements Movers{
	public void move() {
		System.out.println("runs like a cat");
	}
}

class Fish implements Movers{
	public void move() {
		System.out.println("swims like a fish");
	}
}

class Exam{
	public static void main(String[]args) {
		Collection<Movers> movers = new ArrayList<Movers>();
		//make two objects and put them in the collection
		movers.add(new Fish());
		movers.add(new Cat());
		//use a foreach loop to print the collection
		for(Movers m : movers) {
			m.move();
		}
		/*Console
		 * 
		 * swims like a fish
		 * runs like a cat
		 */
		//what are the java bash commands to run this program?
		/*
		 * javac CatFish.java
		 * java Exam
		 * 
		 */
		//What git commands to commit to local repo
		/*
		 * git init
		 * git add CatFish.java
		 * git commit -m "1st commit"
		 * 
		 */
		//How do you display 
		/*
		 * * commit 83cfc8ba32d7908da896188d19d86c26d35203d6 (HEAD -> master)
  				Author: Ken Chan <kjchan@udel.edu>
  				Date:   Thu May 23 15:02:22 2019 -0400
      			first commit
      			
      			git log --all --graph
		 */
		//Instead of a foreach loop, use an explicit Iterator
		Iterator<Movers> moveIt = movers.iterator();
		while(moveIt.hasNext()) {
			moveIt.next().move();
		}
	}
}