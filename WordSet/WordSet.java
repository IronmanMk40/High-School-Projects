import java.util.*;

public class WordSet {

	public static void main(String[] args) {
		
	//Creates scanner object for user input
	Scanner keyboard = new Scanner(System.in);
	
	//Asks user for words to be tokenized and printed
	System.out.println("Please enter a phrase to be printed word by word.");
		String words = keyboard.nextLine(); //Receives input
		
	//Separates string into tokens and places them in an array
	String[] tokenizationString = words.split(" ");
	
	//Creates a new ArrayList that sorts new tokens in a TreeSet
	SortedSet<String> tokenizedWords = new TreeSet<>();
		
	//Adds all original array elements in the ArrayList
	for(String str : tokenizationString)
		tokenizedWords.add(str);

	//Prints all elements of the TreeSet
	for (String str : tokenizedWords) 
		System.out.println(str);
	}

}
