/*
* This program compares passwords to make sure the user entered them correctly
*/

import java.util.Scanner;

public class passwordComparison
{
   public static void main(String[] args)
   {
   
   //Gets all needed user input
   Scanner userInput = new Scanner(System.in);
   
   System.out.println("Please enter your password");
      String passwordOne = userInput.next();
      
   System.out.println("Please re-enter your password");
      String passwordTwo = userInput.next();
   
   //Checks if strings are equal, and outputs accordingly
   if (passwordOne.equals(passwordTwo))
      System.out.println("Your passwords match!");
      
      else
         System.out.println("Your passwords do not match");
   
   }
}