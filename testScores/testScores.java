/*
 * Caleb Matsick
 * Computer Science II Test Scores
 * 9/24/2017
 */

/*
* This program finds the average of test scores
*/

//All of the necessary imports
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

//Test Scores class
public class TestScores {

	//Main Method
	public static void main(String[] args) throws IOException {

	//Creates scanner object
	Scanner userInput = new Scanner (System.in);

	// Creates ArrayList for test scores to be stored in
	ArrayList<String> testScores = new ArrayList<String>();

	//Gets the user's 1st test score
	System.out.println("Hello! Please enter one test score then hit enter.");
	String score = userInput.nextLine();

	int parsedScore = Integer.parseInt(score);
	//Throws illegal argument if score is out of range
	if (parsedScore < -1 || parsedScore > 100)
		throw new IllegalArgumentException("Error: score cannot be negative or over 100.");

	//Sets boolean flag
	boolean flag = true;

	//Loop that repeats until all test scores have been entered
	while (flag == true) {

		//Adds score in ArrayList
		testScores.add(score);

		//Asks for another entry
		System.out.println("Please enter another score, or enter \"-1\".");
			score = userInput.nextLine();

		int loopParsedScore = Integer.parseInt(score);
		//Throws illegal argument if score is out of range
		if (loopParsedScore < -1 || loopParsedScore > 100)
		throw new IllegalArgumentException("Error: score cannot be negative or over 100.");

		//Escapes from loop if entered
		if (loopParsedScore == -1)
			flag = false;
	}

	//Calls average method to get the average of the test scores, then prints the average
    double average = testAverage(testScores);
	     System.out.println("The average test score is " + average);

	int size = testScores.size();

	//Calls a method to serialize that write the ArrayList to a file
	Serialize(testScores);
	deserialize();
	}

		/*
		 * This method finds the average of the test scores
		 */
		public static double testAverage(ArrayList<String> testScores) {

			//Adds scores together
			double sumOfScores = 0;
			int i;
			for(i = 0; i < testScores.size(); i++) {
			int aScore = Integer.parseInt(testScores.get(i));
			sumOfScores += aScore;
			}


			//Divides sum by number of scores to get the average
			double average = sumOfScores / testScores.size();

			return average; //returns average
		}

	/*
	 * This method serializes and writes the tests scores to a file
	 */
	public static void Serialize(ArrayList<String> testScores) throws IOException {

		//Serializes ArrayList contents
		FileOutputStream outStream =
				new FileOutputStream("Objects.dat");
				ObjectOutputStream objectOutputFile =
				new ObjectOutputStream(outStream);

		//Writes ArrayList contents to a file
		for (int i = 0; i < testScores.size(); i++)
				objectOutputFile.writeObject(testScores.get(i));

		//Closes file
		objectOutputFile.close();

		//Prints results
		System.out.println("All test scores were written to a file.");
	}

	/*
	 * This method de-serializes and reads the tests scores from a file
	 */
	public static void deserialize() throws IOException {

		//Deserializes contents of file
		FileInputStream inStream = new FileInputStream("Objects.dat");
	    ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

	   //Closes file
	   objectInputFile.close();

		//Returns message upon completion
		System.out.println("The file has been deserialized");
	}
}
