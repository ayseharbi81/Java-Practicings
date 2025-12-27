package inheritance_2;

import models.A;

public class new_27 {

	public static void main(String[] args) {

		A a = new A(5, 10);
		
		System.out.println("A object b variable1: " + a.variable1b);
		System.out.println("A object b variable2: " + a.variable2b);
		// As we can see that the console wrote the C class first.
		
		a.aClassMethod();
		
		

	}

}
