package ussu_sayi_math_kutuphanesi_ile;

import java.util.Scanner;

public class new_32 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please give the number that you wanna take its pow: ");
		double down = scanner.nextInt();
		
		System.out.println("Please the upper number: ");
		double upper = scanner.nextInt();
		
		double result = Math.pow(down, upper);
		
		if (down == 0 && upper == 0)
			System.out.println("The result is indefinite.");
		else
			System.out.println("The result is " + result + ".");	
		
	}

}
