package models;

public class A extends B{

	// super(); how to use;
	// 1) should be on top
	// 2) should be called in a constructor
	
	public int variable1;
	
	public int variable2;
	
	public A(){
		
		System.out.println("We're in the A class now.");
		
	}
	
	public A(int variable1, int variable2) {
		
		super(variable1, variable2);
		
		//this.variable1 = variable1;
		//this.variable2 = variable2;
	}
	
	public void aClassMethod() {
		
		System.out.println("I'm in the a class method.");
		super.bClassMethod();//can take the inherited class method with super process.
		
	}
	
	



	
}
