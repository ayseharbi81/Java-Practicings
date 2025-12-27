package inheritance;

public class new_26 {

	public static void main(String[] args) {
		// inheritance (kalitim) allows us to use the super class' (ust class)
		// specials into sub class (alt class).
		
		// As you can see we used the age variable which is from animal class but in dog class.
		Dog dog = new Dog();
		dog.age = 12; 
		
		System.out.println(dog.age);
		
		// we can do the same process with the methods too.
		dog.breath();
		
		// public = can access from anywhere
		// private = can access only from the same class
		// protected = can access from same class and also inherited class' methods or constructors

	}

}
