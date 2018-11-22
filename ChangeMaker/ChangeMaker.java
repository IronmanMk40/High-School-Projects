/*
This program generates the change that 
should be given for any amount of pennies
*/

import java.util.Scanner;

public class ChangeMaker
{
   public static void main(String[] args)
   {
   //Declares all variables
   int dollars = 0;
   int quarters = 0;
   int dimes = 0;
   int nickels = 0;
   int pennies = 0;
   
   //Gets the number of pennies user has
   System.out.println("Enter number of pennies");
      Scanner userInput = new Scanner (System.in);
      int userPennies = userInput.nextInt();
   
   //Performs calculations for the amount of dollars and coins that should be returned
   dollars = userPennies / 100;
   quarters = (userPennies % 100) / 25;
   dimes = ((userPennies % 100) % 25) / 10;
   nickels = (((userPennies % 100) % 25) % 10) / 5;
   pennies = (((userPennies % 100) % 25) % 10) % 5;
   
   //Outputs the results of the calculations
   System.out.println("Number of dollars: " + dollars);
   System.out.println("Number of quarters: " + quarters);
   System.out.println("Number of dimes: " + dimes);
   System.out.println("Number of nickels: " + nickels); 
   System.out.println("Number of pennies: " + pennies);
   }
}