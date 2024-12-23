package homework;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		
		System.out.print("Please enter the user name: ");
		String name = b.next();
		
		System.out.print("Enter your mark 1: ");
		double mark1 = b.nextDouble();
		System.out.print("Enter your mark 2: ");
		double mark2 = b.nextDouble();
		System.out.print("Enter your mark 3: ");
		double mark3 = b.nextDouble();
		
		double total = mark1 + mark2 + mark3;
		System.out.println( name + "'s total score is " + total + ".");
		
		double average = total / 3;
		System.out.println( name + "'s average score is " + average + ".");
		
		if (average >=90 && average <= 100) {
			System.out.println("Grade A.");
		} else if (average >= 80) {
			System.out.println("Grade B.");
		} else if (average >= 70) {
			System.out.println("Grade C.");
		} else if (average >=60) {
			System.out.println("Grade D.");
		} else {
			System.out.println("Grade F.");
		}
		
		b.close();
				
		
		
	}

}