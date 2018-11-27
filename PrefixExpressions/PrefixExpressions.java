import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 * PrefixExpressions.java - A program that allows the user to add or 
 *                   		multiply numbers with prefix expressions
 * @author Caleb Matsick
 * @version 1.0
 * @see PrefixExpressions
 */

public class PrefixExpressions {

	/*
	 * This main method runs the whole program and performs the functions
	 */
    public static void main(String[] args) {
    	
    	//Asks user for the expression they would like to evaluate
    	String preEx = JOptionPane.showInputDialog("Enter a prefix expressions "
    			+ "you would like to evaluate");
    	
    	//Tokenizes the string and puts it into an array
        String[] prefixEx = preEx.split(" ");
        
        //Creates a LinkedList for the stack
        LinkedList<Integer> stack = new LinkedList<>();
        
        //Creates a for loop to evaluate the expression
        for(int i = prefixEx.length - 1; i > -1; i--) {
            String prefixItem = prefixEx[i];
            
            //Used if a space is entered before an operator
            if(prefixItem.equals("")) {
                continue;
            }
            
            //Evaluates the expression if "+" is the operator
            if(prefixItem.equals("+")) {
                stack.push(stack.poll()+stack.poll());
            }
            
            //Evaluates the expression if "*" is the operator
            else if(prefixItem.equals("*")) {
                stack.push(stack.poll() * stack.poll());
            }
            
            //Adds and returns next item to the top of the stack
            else {
                stack.push(Integer.parseInt(prefixItem));
            }
        }
    //Prints out the result of the function   
    JOptionPane.showMessageDialog(null, "The result was " + stack.poll());
    }
}
