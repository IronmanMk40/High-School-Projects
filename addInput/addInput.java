/*
 * One of my first programs that just adds
 * two numbers inputted by the user
 */

import java.util.Scanner;

public class addInput {

	public static void main(String[] args) {

	// Declares variable for answer
    int sum;

		// Asks user to input two numbers in a semi-passive agressive way
		System.out.println("This simple, easy, basic, amatuer, low-level, easy program that adds two numbers... Please input. Yay :|");
			Scanner key = new Scanner (System.in);
			int num = key.nextInt();
			int num1 = key.nextInt();

		// Adds both numbers
		sum = num + num1;
		
		// Outputs sum
		System.out.println("The sum of the two numbers is " + sum);
	}
}
