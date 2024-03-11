import java.util.Scanner;

public class Factoriser {
    static public int numberOfFactoriserInstances = 0; // added this for fun to just try a static variable
    private int sumOfFactors = 1; // private variables so the only way to review the answers would be
    private int totalFactors = 1;
    private final int NUMBER; // final because it doesn't change
    public Factoriser(int number) {
        this.NUMBER = number;
        numberOfFactoriserInstances++;
    }

    public void prettyPrint() {
        System.out.println("\n" + NUMBER + " has " + totalFactors + " factors.");

        // Exclude the number itself for perfect number check
        if (NUMBER != 1 && sumOfFactors == NUMBER) {
            System.out.println(NUMBER + " is a perfect number.");
        } else {
            System.out.println(NUMBER + " is not a perfect number.");
        }

        if (totalFactors == 2) { // Prime numbers have exactly two factors: 1 and themselves
            System.out.println(NUMBER + " is a prime number.");
        } else {
            System.out.println(NUMBER + " is not a prime number.");
        }
    }

    public void factorNumber() {
        if (NUMBER < 0) {
            System.out.println("This program is meant for positive numbers only as negative numbers cannot be prime.");
            return; // exits the method if negative number
        }

        System.out.print("Factors of " + NUMBER + ": 1 ");
        for (int i = 2; i <= Math.sqrt(NUMBER); i++) {
            if (NUMBER % i == 0) {
                System.out.print(i + " ");
                sumOfFactors += i;
                totalFactors++;

                int otherFactor = NUMBER / i;
                if (i != otherFactor) {
                    System.out.print(otherFactor + " ");
                    sumOfFactors += otherFactor;
                    totalFactors++;
                }
            }
        }
        if (NUMBER != 1) {
            System.out.print(NUMBER); // Print the number itself as a factor
            totalFactors++; // Include the number itself in total factors
        }

        System.out.println("\n" + NUMBER + " has " + totalFactors + " factors.");
    }

    public static void main(String[] args) {
    }
}