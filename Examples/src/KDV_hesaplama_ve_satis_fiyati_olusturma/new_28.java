package KDV_hesaplama_ve_satis_fiyati_olusturma;

import java.util.Scanner;

public class new_28 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please decide the price of the product that you wanna buy: ");
		
		float price = scanner.nextFloat();
		
		System.out.println("KDV is %18 so total price is: ");
		
		float tax = 0.18f;
		
		float total_price = (price*tax) + price;
		
		System.out.println(total_price);
		
		
	}

}
