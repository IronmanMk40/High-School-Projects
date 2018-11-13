/* 
* This program calculates how many points a bookpurchaser should
* recieve based on the amount of books they buy
*/

import java.util.Scanner;

public class Bookseller
{
   public static void main(String[] args)
   {
   
   //Declares variables
   int booksPurchased;
   
   //Creates scanner object for userinput
   Scanner userInput = new Scanner(System.in);
   
   //Gets needed userinput
   System.out.println("Please enter the number of books you have purchased");
      booksPurchased = userInput.nextInt();

   //Switch statement with all needed output
      switch (booksPurchased)
      {
      case 0: System.out.println("You have earned 0 points");
      break;
      
      case 1: System.out.println("You have earned 5 points");
      break;
      
      case 2: System.out.println("You have earned 15 points");
      break;
     
      case 3: System.out.println("You have earned 30 points");
      break;

      default: System.out.println("You have earned 60 points");
      }
   }
}
