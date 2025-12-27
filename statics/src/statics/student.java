package statics;

public class student {

	private Long id;

	private String name;
	
	private String surname;
	
	public static String number;
	
	public String number1;
	
	public static String number2;
	
	//We can not reach a variable or method that is not static in the static method.
	public static void write_the_number()
	{
		System.out.println("Number from method: " + number);
	}

	public void student_infos()
	{
		System.out.println("Id: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Surname: " + getSurname());
		write_the_number();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	
}
