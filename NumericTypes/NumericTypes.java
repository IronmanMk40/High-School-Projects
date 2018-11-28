//Code Listing (NumericTypes.java)

//

//Help this programmer out!



 

public class NumericTypes

{

public static void main (String [] args)

{

//identifier declarations

final double NUMBER = 2; // number of scores

final double SCORE1 = 100; // first test score

final double SCORE2 = 95; // second test score

double average; // arithmetic average

 

final double BOILING_IN_F = 212; // boiling temperature

double fToC; // temperature in Celsius

 

double radius = 10; // radius of the sphere;         

final double PI = 3.14159; // value of PI

double volume; // volume of a sphere



// the main body of code

String output; // line of output to print out

 

// Find an arithmetic average

average = (SCORE1 + SCORE2) / NUMBER;

output = SCORE1 + " and " + SCORE2 + " have an average of " + average;

System.out.println(output);

 

// Convert Fahrenheit temperatures to Celsius

fToC = 5 / 9 * (BOILING_IN_F - 32);

output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";

System.out.println(output); 
 


// Find the volume of a sphere

volume = 4 / 3 * (PI  *  (radius * radius * radius));

System.out.println("The volume of the sphere that has a radius of " + radius + " is " + volume);

}

}