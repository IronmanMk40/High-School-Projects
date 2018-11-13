/*
This is a program for the game Rock, Paper, Scissors
*/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
   /*
   This method calls all the other methods and controls the program
   */
   public static void main(String[] args)
   {
      //Declares variables
      String playerName, userChoice = "", computeChoice, result = "";
      int gamesPlayed = 0, computerWins = 0, userWins = 0, ties = 0;
      
      //Calls methods
      playerName = getPlayerName();
      helloMessage(playerName);
      
         //Loops the entire game
         while (!userChoice.equals("done"))
         {
         userChoice = playerChoice();
         computeChoice = computerChoice();
         result = determineWinner(userChoice, computeChoice);
         
            //Adds one to whoever wins and games played
            if (result.equals("userWins"))
               {
               ++userWins;
               }
            if (result.equals("computerWins"))
               {
               ++computerWins;
               }
            if (result.equals("ties"))
               {
               ++ties;
               }
            if (!userChoice.equals("done"))
               {
               ++gamesPlayed;
               }
         }
      //Calls the scoreboard method
      scoreboard(computerWins, userWins, ties, gamesPlayed);
   }
      
      
   /*
   This method gets the players name
   */
   public static String getPlayerName()
      {
      String playerName;
      
      //Gets the users name
      Scanner userInput = new Scanner (System.in);
      
      System.out.println("Please enter your first name");
         playerName = userInput.nextLine();
         
      //Tries to get name again if nothing is entered
      while (playerName.equals(""))
         {
            System.out.println("Please enter your first name");
               playerName = userInput.nextLine();
         }
      return playerName;
   }
   
   
   /*
   This method displays a welcome message
   */
   public static void helloMessage(String playerName)
   {
      //Outputs hello message 
      System.out.println("Hello " + playerName + ", welcome to the Rock, Paper, Scissors game");
   } 
      
      
   /*
   This method gets the players choice
   */
   public static String playerChoice()
   {
      String choice;
      
      //Gets the users choice
      Scanner userInput = new Scanner (System.in);
      
      System.out.println("Please enter Rock, Paper, Scissors, or Done");
         choice = userInput.next();
      
      //Changes users choice to lowercase to make their answer case insensitive
      choice = choice.toLowerCase();
      
      while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors") && !choice.equals("done"))
         {
            System.out.println("Please enter Rock, Paper, Scissors, or Done");
               choice = userInput.next();
               choice = choice.toLowerCase();
         }
      return choice;
   }
      
      
   /*   
   This method gets the computers choice
   */
   public static String computerChoice()
   {
      String comChoice = "";
      
      //Generates a random number for the computer that correlates to a certain choice
      Random randomNumbers = new Random();
      
      int randNum = randomNumbers.nextInt(3);
   
      if (randNum == 0)
         {
            System.out.println("Computer choose Rock");
            comChoice = "rock";
         }
         
      if (randNum == 1)
         {
            System.out.println("Computer choose Paper");
            comChoice = "paper";
         }
         
      if (randNum == 2)
         {
            System.out.println("Computer choose Scissors");
            comChoice = "scissors";
         }
      return comChoice;
   }
    
    
   /*
   This method determines the winner  
   */
   public static String determineWinner(String choice, String comChoice)
   {
      String result = "";
      
      //Decides whether the user or computer wins, or if it's a tie
      
      //When user enters rock
      if (choice.equals("rock") && comChoice.equals("paper"))
         {
            System.out.println("The computer wins");
            result = "computerWins";
         }
         
      if (choice.equals("rock") && comChoice.equals("scissors"))
         {
            System.out.println("The user wins");
            result = "userWins";
         }
   
      //When user enters paper   
      if (choice.equals("paper") && comChoice.equals("rock"))
         {
            System.out.println("The user wins");
            result = "userWins";
         }
   
      if (choice.equals("paper") && comChoice.equals("scissors"))
         {
            System.out.println("The computer wins");
            result = "computerWins";
         }
         
      //When user enters scissors
      if (choice.equals("scissors") && comChoice.equals("rock"))
         {
            System.out.println("The computer wins");
            result = "computerWins";
         }
         
      if (choice.equals("scissors") && comChoice.equals("paper"))
         {
            System.out.println("The user wins");
            result = "userWins";
         }
         
      //If both choose the same one  
      if (choice.equals(comChoice))
         {
            System.out.println("It is a tie");
            result = "ties";
         } 
      return result;      
   }
     
     
   /*   
   This method displays the scoreboard
   */
   public static void scoreboard(int computerWins, int userWins, int ties, int gamesPlayed)
   {   
      //Outputs final scores and information for the user
      System.out.println("The computer won " + computerWins + " times");
      System.out.println("The user won " + userWins + " times");
      System.out.println("The two players tied " + ties + " times");
      System.out.println("Altogether " + gamesPlayed + " games were played");
   }
}