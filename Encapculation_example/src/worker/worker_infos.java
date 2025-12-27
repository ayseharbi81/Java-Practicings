package worker;

public class worker_infos {
	
	// Constructor ile erişebilirim ya da getter setter (kapsulleme) ile
	
	private long ID;
	
	private String name;
	
	private String surname;
	
	private int salary;

	public worker_infos() {
		
	}
	
	public worker_infos(long iD, String Name, String Surname, int Salary) {
		
		this.ID= iD;
		this.name = Name;
		this.surname = Surname;
		this.salary = Salary;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary >= 1000 && salary <= 5000)
		{
			this.salary = salary;
		}
	}
	
	
	
	
}
