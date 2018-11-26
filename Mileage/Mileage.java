import java.util.Scanner;

public class Mileage
{
   public static void main(String[] args) {
   
      double milesDriven;
      double gallonsUsed;
      milesDriven = 0;
      gallonsUsed = 0;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println ("This program calculates gas milage");
      System.out.println ("Enter number of miles driven");
      
   milesDriven = keyboard.nextDouble();
   
      System.out.println ("Enter number of gallons used");
      
   gallonsUsed = keyboard.nextDouble();
   double milesPerGallon;
   milesPerGallon = milesDriven / gallonsUsed;
      System.out.println ("Your Miles per gallon is " + milesPerGallon);
   }
}