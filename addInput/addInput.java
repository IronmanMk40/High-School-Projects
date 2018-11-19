/*
 * One of my first programs that just adds
 * two numbers inputted by the user
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

    int num2;

		System.out.println("This simple, easy, basic, amatuer, low-level, easy program adds two numbers... Yay :|");
			Scanner key = new Scanner (System.in);
			int num = key.nextInt();
			int num1 = key.nextInt();

		num2 = num + num1;

		System.out.println("The sum of the two numbers is " + num2);
	}
}
