package classlara_giris;

import com.osman.student;

public class new_21 {

	public static void main(String[] args) {
		
		// when we do like this the computer will read constructor first.
		student student1 = new student("Male");
		
		student1.ID = 220202080;
		student1.name = "Haci Osman";
		student1.surname = "Gundogdu";
		
		System.out.println("Student Info:\n");
		System.out.println("ID: " + student1.ID);
		System.out.println("Name: " + student1.name);
		System.out.println("Surname: " + student1.surname);
		student1.write();
		// student1.gender = "male"; this doesn't work because the gender's access modifier is private.
		
		student student2 = new student();
		
		System.out.println("Float number is: " + student2.number);
        
        

	}

}
