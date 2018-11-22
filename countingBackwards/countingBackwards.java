//This program counts backwards along with 
//returning user input and number of numbers

import java.util.Scanner;

public class countingBackwards
{
   public static void main(String args[])
   {
   //Declares all variable
   
   int number1;
   int number2;
   int range;
   
   //Creates scanner object
   Scanner userInput = new Scanner(System.in);
   
   //Gets user input
   System.out.println("Please enter a number");
      number1 = userInput.nextInt();
   
   System.out.println("Please enter a second number that is less than and not equal to the first");
      number2 = userInput.nextInt();
      
   //Determines range
   
   range = number1 - number2 + 1;
      
   //Makes calculations and outputs to user
   if (number1 <= number2)
      System.out.println("Invalid input");
      
   else
      {
      System.out.println("There are " + range + " numbers between " + number1 + " and " + number2);
      while (number1 >= number2)
         {
            if ((number1 % 10) == 0)
               System.out.println(number1 + "*");
               
            else   
               System.out.println(number1);
               
         number1--;
         }
      System.out.println("Done");
      }
   }
}