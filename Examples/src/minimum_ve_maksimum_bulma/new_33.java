package minimum_ve_maksimum_bulma;

import java.util.Scanner;

public class new_33 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please give 4 numbers to find max and min: ");
		
		int[] numbers = new int[4];
		int i;
		
		for (i = 0; i < 4; i++)
		{
			numbers[i] = scanner.nextInt();
		}
		
		int min = numbers[0];
		
		for (i = 1; i < 4; i++)
		{
			if (min > numbers[i])
				min = numbers[i];
		}
		
		int max = numbers[0];
		
		for (i = 1; i < 4; i++)
		{
			if (max < numbers[i])
				max = numbers[i];
		}
		
		System.out.println("Min : " + min + "\nMax : " + max);
		
	}

}
