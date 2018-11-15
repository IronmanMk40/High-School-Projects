/*
* This program asks the user for a text file and
* then outputs the contents to the console
*/

import java.util.Scanner;
import java.io.*;

public class fileReader
{
   public static void main(String[] args) throws IOException
   {
   //Creates Scanner object and gets user input
   Scanner userInput = new Scanner(System.in);

   System.out.println("Please enter the name of the file you would like to read");
      String fileName = userInput.next();

   //Adds .txt to the file name
   String fullName = fileName + ".txt";

   //Reads file and finds needed letters
   File myFile = new File(fullName);
   Scanner inputFile = new Scanner(myFile);

      //Outputs the contents
      while (inputFile.hasNext());
      {
      String str = inputFile.nextLine();
      System.out.println(str);
      }
   //Closes the file
   inputFile.close();
   }
}
