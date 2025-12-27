package statics;

public class new_25 {

	public static void main(String[] args) {
		
		// static allows us to use variables or methods without creating an object
		
		// normalde asagidaki gibi oluyor:
		//student student1 = new student();
		//System.out.println("number: " + student1.number);
		 
		// But if we use static for the variable then we are doing like this below:
		student.number = "220202080";
		//System.out.println("Number: " + student.number);
		
		//now let's try static methods:
		//student.write_the_number();
		
		student student1 = new student();
		
		student1.setId(5L);
		student1.setName("Haci Osman");
		student1.setSurname("Gundogdu");
		
		student1.student_infos();
		
		//Let's see another thing about the static.
		// first public String number1 from student2
		student student2 = new student();
		student2.number1 = "11111";
		System.out.println(student2.number1);
		System.out.println("---------------------");
		
		student student3 = new student();
		System.out.println(student3.number1);
		
		// now Let's see public static String number2 
		student.number2 = "11111";
		System.out.println(student.number2);
		System.out.println("---------------------");
		
		
		System.out.println(student.number2);
		
		// We saw that the static is from class but non-static is not. 
		// That means static gives the value for each object because it is from class.
		// Non-static one gives the value to objects special by special.
		
		
		
		
		
	}

}
