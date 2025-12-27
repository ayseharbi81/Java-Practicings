package koninin_hacmi;

import java.util.Scanner;

public class new_30 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please give the radius of the cone: ");
		float radius = scanner.nextFloat();
		
		System.out.println("Please give the height of the cone: ");
		float height = scanner.nextFloat();
		float pi = 3.14f;
		
		float volume_of_the_cone = ((float)1/3)*pi*radius*radius*height;
		System.out.println("The volume of the cone according to your values is " + volume_of_the_cone + ".");

	}

}
