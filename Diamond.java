package homework;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner b = new Scanner(System.in);
		System.out.print("Please enter the height of the diamond (an odd number): ");
		int height = b.nextInt();
		
		if (height % 2 == 0 || height <= 0){
			do {
			System.out.print("Please enter a positive odd number: ");
			height = b.nextInt();
			} while (height % 2 == 0);
		}
	
		
		for (int row = 1; row <= (height +1)/2; row++) {
			for (int space = 1; space <= (height + 1)/2 - row; space ++) {
			System.out.print(" ");
			}	
			
			int stars = 1;
		
			do {
				System.out.print("*");
				stars ++;
			} while (stars <= 2 * row - 1);
		
			System.out.println();
		}
		
		for (int row = (height + 3)/2; row <= height; row ++) {
			for (int space = 1; space <= row - (height +1) / 2; space ++) {
				System.out.print(" ");
			}
			int stars = 1;
			do {
				System.out.print("*");
				stars ++;
			} while (stars <= 2 * (height - row) +1 );
			
			System.out.println();
		}
		b.close();
	}
}
		
	
