import java.util.Scanner;

public class RecursivePowerMethod {
	
	/**
	 * 
	 * Main method that controls operations and controls I/O
	 * 
	 */
	public static void main(String[] args) {
		
		//Creates scanner object for user input
		Scanner userInput = new Scanner (System.in);
		
		//Asks for and receives user's base number
		System.out.println("Please enter an integer you would like to raise to a certain value.");
			int baseNum = userInput.nextInt();
				
		//Asks for and receives user's power number
		System.out.println("Please enter the integer power you would like to raise the previous number to.");
			int powerNum = userInput.nextInt();
	
	int result;


	//Method that computes result of power operation
    result = operation(baseNum, powerNum);
	
    //Sets result to 1 if user choose power of 0
    if (powerNum == 0)
    	result = 1;
    
    //Returns result
    System.out.println("The result of the operation equals " + result + ".");
	}
	
	/**
	 * 
	 * This method performs operations on the base to raise it to a power
	 * 
	 */
	public static int operation(int base, int power) {

		if (power > 1)
			return base * operation(base, power - 1);
		else
			return base;
	}
}
