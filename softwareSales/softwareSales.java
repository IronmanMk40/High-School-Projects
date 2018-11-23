//This program calcuates the discount and price of a software package

import java.util.Scanner;
import java.text.DecimalFormat;

public class softwareSales
{
   public static void main(String[] args)
   {
   
   //Declares all variables
   
   double Total = 0;
   int subtotal = 0;
   int packages;
   
   //Creates scanner object for user input
      
   Scanner userInput = new Scanner(System.in);
   
   //Gets all needed user input
   
   System.out.println("Enter the quantity of packages purchased");
      packages = userInput.nextInt();
      
   //Performs needed calculation
   
   subtotal = packages * 99;
   
   //Creates a new DecimalFormat object
   
   DecimalFormat formatter = new DecimalFormat(",##0.00");
      
   //Outputs subtotal minus the quantity discount
   
   if ((packages >= 1) && (packages <= 9))
      {
      System.out.println("Sorry, you will recieve no discount");
      System.out.println("Your total purchase price is $" + formatter.format (subtotal));
      }
      
      else if ((packages >= 10) && (packages <= 19))
         {
         Total = subtotal * 0.80;
         System.out.println("Your purchase of " + packages + " provides a quantity discount of 20%");
         System.out.println("Your total purchase price is $" + formatter.format (Total));
         }
         
         else if ((packages >= 20) && (packages <= 49))
            {
            Total = subtotal * 0.70;
            System.out.println("Your purchase of " + packages + " provides a quantity discount of 30%");
            System.out.println("Your total purchase price is $" + formatter.format (Total));
            }
            
            else if ((packages >= 50) && (packages <= 99))
               {
               Total = subtotal * 0.60;
               System.out.println("Your purchase of " + packages + " provides a quantity discount of 40%");
               System.out.println("Your total purchase price is $" + formatter.format (Total));
               }
               
               else
                  {
                  Total = subtotal * 0.50;
                  System.out.println("Your purchase of " + packages + " provides a quantity discount of 50%");
                  System.out.println("Your total purchase price is $" + formatter.format (Total));
                  }
   }
}