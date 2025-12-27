package kuruslar_ve_toplamlari;

import java.util.Scanner;

public class new_29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int one, five, ten, twenty_five, fifty; 
		int one_value = 1, five_value = 5, ten_value = 10, twenty_five_value = 25, fifty_value = 50;
		int total1, total2, total3, total4, total5, last_total;
		
		System.out.println("Please give how many 1 cent pieces: ");
		one = scanner.nextInt();
		total1 = one*one_value;
		
		System.out.println("Please give how many 5 cent pieces: ");
		five = scanner.nextInt();
		total2 = five*five_value;
		
		System.out.println("Please give how many 10 cent pieces: ");
		ten = scanner.nextInt();
		total3 = ten*ten_value;
		
		System.out.println("Please give how many 25 cent pieces: ");
		twenty_five = scanner.nextInt();
		total4 = twenty_five*twenty_five_value;
		
		System.out.println("Please give how many 50 cent pieces: ");
		fifty = scanner.nextInt();
		total5 = fifty*fifty_value;
		
		last_total = total1 + total2 + total3 + total4 + total5;
		
		int TL = last_total / 100;
		int cent = last_total % 100;
		
		System.out.println("Total value is " + TL + " TLs and " + cent + " cents.");
		
		
		
		

	}

}
