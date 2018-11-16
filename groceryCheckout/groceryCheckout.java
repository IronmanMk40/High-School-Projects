//Calculates total cost of groceries, highest priced item, 
//lowest priced item, and number of items entered

import java.util.Scanner;
import java.text.DecimalFormat;

public class groceryCheckout
{
   public static void main(String args[])
   {
   //Declares all variables and sets accumulator to 0
   double totalCost = 0.00;
   double groceryCost;
   double lowest = Double.MAX_VALUE;
   double highest = Double.MIN_VALUE;
   int itemNumber = 2;
   int totalItems = 0;
   
   //Creates scanner and DecimalFormat objects
   Scanner userInput = new Scanner(System.in);
   DecimalFormat dollar = new DecimalFormat("$,##0.00");
   
   //Gets userinput
   System.out.println("Enter the cost of Item #1 or -1 to finish");
      groceryCost = userInput.nextDouble();
      
   //Lets the user know no items were entered if -1 was entered first
   if (groceryCost == -1)
      System.out.println("No items were entered");
      
   //Finishes the rest of the program if items were entered
   else
      {
   //Accumulates cost until -1 is entered
        while (groceryCost != -1)
        {
        totalCost += groceryCost;  //Adds individual cost to total
          
        //Finds the lowest and highest costs of the groceries       
        if (lowest > groceryCost)
           lowest = groceryCost;
        
        if (highest < groceryCost)
           highest = groceryCost;
         
        //Asks user for another item or to exit loop  
        System.out.println("Enter the cost of Item #" + itemNumber + " cost or -1 to end");
           groceryCost = userInput.nextDouble();

        totalItems++; //Adds one to total items
        itemNumber++; //Adds one to item number
        }
      
      //Displays total cost, highest priced item, lowest priced, and total items to user
      System.out.println("The number of items entered is " + totalItems);
      System.out.println("The lowest price item was " + dollar.format(lowest));
      System.out.println("The highest price item was " + dollar.format(highest));
      System.out.println("The total cost for the groceries is " + dollar.format(totalCost));
      }
    }
}