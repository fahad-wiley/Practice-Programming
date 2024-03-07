import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        byte roundsToPlay; // smaller memory allocation

        while(true) { // to make sure to ask again if outside of range // I know I changed it from the brief a bit
            System.out.println("How many rounds would you like to play? (1-10)");
            roundsToPlay = Byte.parseByte(myScanner.nextLine());
            if (roundsToPlay<=10 && roundsToPlay>=1) break;

            System.out.println("Please give an answer within the range.");
        }

        Random myRng = new Random(); // Instantiate this object once outside the loop, because can just use one instead of every iteration have another one
        int playerWinCount = 0; // int in case player wins more than 127 games
        int computerWinCount = 0;


        while(roundsToPlay > 0) {
            byte playerChoice;
            byte computerChoice;
            System.out.println("-------");
            System.out.println("Current players wins: " + playerWinCount + ". Computer wins: " + computerWinCount + ".\n");
            do {
                System.out.println("Make your choice! 1 = Rock, 2 = Paper, 3 = Scissors");
                playerChoice = Byte.parseByte(myScanner.nextLine());
                if (playerChoice > 3 || playerChoice < 1) System.out.println("Please retry and pick a number from 1-3.");
            } while (playerChoice > 3 || playerChoice < 1);

            roundsToPlay--; // at this point because the user has locked in an answer

            computerChoice = (byte) (myRng.nextInt(3) + 1); //number from 0-2 + 1, so it gives 1-3

            System.out.print("Computer chose ");
            switch(computerChoice) { // to show user what computer chose, so they don't feel cheated
                case 1:
                    System.out.print("Rock.\n");
                    break;
                case 2:
                    System.out.print("Paper.\n");
                    break;
                case 3:
                    System.out.print("Scissors.\n");
                    break;

            }


            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            }
            else if ((playerChoice == 1 && computerChoice == 3) ||
                    (playerChoice == 2 && computerChoice == 1) ||
                    (playerChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
                playerWinCount++;
            }
            else {
                System.out.println("Computer wins!");
                computerWinCount++;
            }

        }

        System.out.println("Game has ended!");

        if (playerWinCount > computerWinCount) System.out.println("You have bested the computer!");
        else if (playerWinCount < computerWinCount) System.out.println("You are equally matched with the computer!");
        else System.out.println("The computer must know something you don't, it bested you!");


    }
}
