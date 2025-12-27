package main;

import worker.worker_infos;

public class new_23 {

	public static void main(String[] args) {

		worker_infos worker1 = new worker_infos();
		
		worker1.setID(220202080L);
		
		System.out.println("Worker's ID is: " + worker1.getID());
		
		// degiskeni private ile sakladim
		// set metodu ile erisip deger atadim
		// get metodu ile degerine eristim
		
		worker1.setSalary(4500);

		System.out.println("The salary is = " + worker1.getSalary());
	}

}
