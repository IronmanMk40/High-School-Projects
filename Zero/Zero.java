/*
* This program divides number, and outputs an error 
* essage if the user tries to divide by zero
*/

import java.util.Scanner;

public class Zero
{
   public static void main(String[] args)
   {
   //Declares remainders
   
   int quotient = 0;
   int remainder = 0;

   //Gets all needed user input
   Scanner userInput = new Scanner (System.in);
   
   System.out.println("Please enter an integer dividend");
      int dividend = userInput.nextInt();
   
   System.out.println("Please enter an integer divisor");
      int divisor = userInput.nextInt();

   //Outsputs error message if dividing by zero  
    
   if (divisor == 0)
      System.out.println("You cannot divide by zero");

   //Determines whether dividend and divisor are odd or even, then outputs to user
   
   else
      {
   
      if ((dividend % 2) == 0)
         System.out.println("The Dividend is even");
      
         else
            System.out.println("The Dividend is odd");
      
      if ((divisor % 2) == 0)
         System.out.println("The Divisor is even");
      
         else
            System.out.println("The Divisor is odd");  
       
   //Performs all needed operations
   
      quotient = dividend / divisor;
      remainder = dividend % divisor; 
      
   //Outputs quotient and remainder to user
     
      System.out.println("The Quotient is " + quotient);
      System.out.println("The Remainder is " + remainder);
      }
   }
}