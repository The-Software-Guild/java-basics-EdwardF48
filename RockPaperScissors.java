package com.sg.foundations.assessments;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        //Initialise variables
        Scanner userInput = new Scanner(System.in);
        Random rng = new Random();
        int rounds;
        int roundChoice;
        String playAgainChoice;
        int compchoice;
        int wins;
        int losses;
        int offset;
        boolean keepPlaying = true;

        //Game loop
        do {
            System.out.println("How many rounds do you want to play?");
            rounds = Integer.parseInt(userInput.nextLine());
            //Check round amount is valid
            if (rounds > 10 || rounds < 1) {
                System.out.println("Not a valid number of rounds (1-10). Goodbye");
                keepPlaying = false;
            } else {
                //Play the rounds
                wins = 0;
                losses =0;
                for (int i = 1; i <= rounds; i++) {
                    //Get user input
                    System.out.println("Round " + i + ":");
                    System.out.println("Choose Rock (1), Paper (2) or Scissors (3))");
                    roundChoice = Integer.parseInt(userInput.nextLine());
                    //generate computer choice
                    compchoice = rng.nextInt(3) + 1;
                    //Calculate winner
                    if (roundChoice == compchoice) {
                        System.out.println("Draw!");
                    } else {
                        switch (roundChoice) {
                            case 2:
                                offset = 2;
                                break;
                            case 3:
                                offset = 1;
                                break;
                            default:
                                offset = 0;
                        }

                        roundChoice = (roundChoice + offset) % 3;
                        compchoice = (compchoice + offset) % 3;

                        if (roundChoice > compchoice) {
                            System.out.println("You Won!");
                            wins += 1;
                        } else {
                            System.out.println("You Lost!");
                            losses += 1;
                        }
                    }
                    System.out.println();
                }
                //Give results after all rounds
                System.out.println("Total Wins: " + wins);
                System.out.println("Total Draws: " + (rounds - wins - losses));
                System.out.println("Total Losses: " + losses);
                if (wins > losses){
                    System.out.println("You won overall");
                }else if(wins<losses){
                    System.out.println("Computer won overall");
                }else{
                    System.out.println("It was a draw overall");
                }
                //ask to play again
                System.out.println();
                System.out.println("Play Again? (Yes/No)");
                playAgainChoice = userInput.nextLine();
                if (playAgainChoice.equals("No")) {
                    keepPlaying = false;
                    System.out.println("Thanks for playing!");
                }
            }
        } while (keepPlaying);
    }
}
