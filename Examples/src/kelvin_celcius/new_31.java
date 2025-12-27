package kelvin_celcius;

import java.util.Scanner;

public class new_31 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please give the celsius value you want: ");
		int celcius = scanner.nextInt();
		int kelvin = celcius + 273 ;
		
		System.out.println("The kelvin version of " + celcius + " celcius is equals " + kelvin + " kelvin.");

	}
}