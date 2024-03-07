import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static int rollDice() {
        Random diceOne = new Random(); // I appreciate that it is random anyway, but I wanted to make two objects because it is supposed to mimic two dice.
        Random diceTwo = new Random();

        int rollOne = diceOne.nextInt(7);
        int rollTwo = diceTwo.nextInt(7);

        return rollOne+rollTwo;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int balance;

        System.out.print("How many dollars do you have? ");
        balance = Integer.parseInt(myScanner.nextLine());

        int rollCount = 0;
        int[] highestBalance = {0, balance}; // first element stores the roll count and the second records the highest balance

        while(balance != 0) {
            rollCount++;
            int roll = rollDice();

            if(roll == 7) {
                balance += 4;

                if(balance > highestBalance[1]) {
                    highestBalance[0] = rollCount;
                    highestBalance[1] = balance;
                }
            }
            else {
                balance--;
            }
        }

        System.out.println("You are broke after " + rollCount + " rolls.");
        System.out.println("You should have quit after " + highestBalance[0] +" rolls when you had $" + highestBalance[1] + ".");

    }
}