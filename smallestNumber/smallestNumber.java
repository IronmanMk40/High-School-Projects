//This program finds the smallest of three numbers for the user

import java.util.Scanner;

public class smallestNumber
{
   public static void main(String[] args)
   {
   
   //Declares all variables
   int number1;
   int number2;
   int number3;
   
   //Gets all needed user input
   Scanner userInput = new Scanner (System.in);
   
   System.out.println("Enter one number");
      number1 = userInput.nextInt();
      
   System.out.println("Enter a second number");
      number2 = userInput.nextInt();
      
   System.out.println("Enter a third number");
      number3 = userInput.nextInt();
   
   //Outputs entered numbers and smallest number to user
   System.out.println("The three numbers entered are " + number1 + ", " + number2 + ", and " + number3);
   
   if (number1 <= number2 && number1 <= number3)
      System.out.println("The smallest number is: " + number1);
      
      else if (number2 <= number1 && number2 <= number3)
         System.out.println("The smallest number is: " + number2);
         
         else 
            System.out.println("The smallest number is: " + number3);       
   }
}