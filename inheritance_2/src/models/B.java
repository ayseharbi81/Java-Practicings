package models;

public class B extends C{
	
	public int variable1b;
	
	public int variable2b;
	
	public B(){
		
		System.out.println("We're in the B class now.");
		
	}
	
	public void bClassMethod() {
		
		System.out.println("I'm in the B class method.");
		
	}

	public B(int variable1b) {
		
		this.variable1b = variable1b;
		System.out.println("The variable called from a class constructor: " + variable1b);
	}

	public B(int variable1b, int variable2b) {
		
		this.variable1b = variable1b;
		this.variable2b = variable2b;
	}

	
	
	

}
