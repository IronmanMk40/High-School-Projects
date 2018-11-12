/*
* This program helps people decide what they should
* wear based on the temperature and cloud cover
*/

import java.util.Scanner;

public class whatToWear
{
   public static void main(String[] args)
   {
   
   //Gets all needed user input
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Enter the temperature in degrees fahrenheit");
      int temperature = keyboard.nextInt();
      
   System.out.println("Is it cloudy or not? Please enter with a Y for yes and a N for no");
      char cloudy = keyboard.next(".").charAt(0);
      
   //Determines what user should wear and outputs the results
      
    if ((temperature >= 75) && ('Y' == cloudy))
      System.out.println("Wear a short-sleeved Hawaiian shirt and get an iced tea");
      
      else if (temperature >= 75)
         System.out.println("Wear a short-sleeved Hawaiian shirt and sun glasses");
         
         else if ((temperature < 75) && (temperature > 65) && ('Y' == cloudy))
            System.out.println("Wear a sweat shirt and bring hot coffee");
         
            else if ((temperature < 75) && (temperature > 65))
               System.out.println("Wear a sweat shirt");
            
               else if ((temperature <= 65) && ('Y' == cloudy))
                  System.out.println("Wear a jacket and bring an umbrella");
               
                   else
                     System.out.println("Wear a jacket and a baseball cap");
   }
}