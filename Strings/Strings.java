//This program is practice with using strings

import java.util.Scanner;

public class Strings
{
   public static void main(String[] args)
   {
   //Gets all needed user input
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Enter your first name");
      String firstName = keyboard.next();
       
   System.out.println("Enter your last name");
      String lastName = keyboard.next();
      
   //Changes full name to uppercase
      String upperFirstName = firstName.toUpperCase();
      String upperLastName = lastName.toUpperCase();
    
   System.out.println("My full name is: " + upperFirstName + " " + upperLastName);
      
   //Outputs the length of the uses name, including spaces
      String fullName = firstName + " " + lastName;
      int length = fullName.length();
   System.out.println("I have " + length + " characters in my full name");
   
   //Changes name to lowercase
      String lowerFirstName = firstName.toLowerCase();
   System.out.println("My friends call me: " + lowerFirstName);
   
   //Outputs users initials
         char firstInitial = firstName.charAt(0);
         char secondInitial = lastName.charAt(0);
    System.out.println("My initials are: " + firstInitial + secondInitial);
   
   //Outputs the 3rd character in users name
         char thirdCharLastName = lastName.charAt(2);
   System.out.println("The 3rd character in my last name is: " + thirdCharLastName);
   }
}