//This program generates the net pay and taxes owed for the user
import java.util.Scanner;

public class Payroll

{
   public static void main(String[] args)
   {
   //Declares all variables
   double netPay;
   double grossPay;
   double federalDeduction;
   double stateDeduction;
   double socialSecurityDeduction;
   double localTownshipDeduction;

   //Gets all needed input from the user
   System.out.println("Enter your first name");
      Scanner userInput = new Scanner (System.in);
      String firstName = userInput.next();
      
   System.out.println("Enter your hours worked");
      double hoursWorked = userInput.nextDouble();
      
   System.out.println("Enter your pay rate");
      double payRate = userInput.nextDouble();
   
   //Calculates the not and gross pay, along with all the taxes
      grossPay = hoursWorked * payRate;
   
      federalDeduction = grossPay * 0.2;
   
      stateDeduction = grossPay * 0.05;
      
      socialSecurityDeduction = grossPay * 0.062;
      
      localTownshipDeduction = grossPay * 0.01;
      
      netPay = grossPay - federalDeduction - stateDeduction - socialSecurityDeduction - localTownshipDeduction;
   
   //Outputs the net pay and taxes owed
   System.out.println("The taxes that " + firstName + " owes to the government:");
   System.out.println("Federal Tax: " + federalDeduction);
   System.out.println("State Tax: " + stateDeduction);
   System.out.println("Social Secirity Tax: " + socialSecurityDeduction);
   System.out.println("Local Township Tax: " + localTownshipDeduction);
   System.out.println("Net Pay: " + netPay);
   }
}