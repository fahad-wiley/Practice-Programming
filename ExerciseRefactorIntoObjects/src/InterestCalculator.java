public class InterestCalculator {
    private double balance;
    private int yearsInvesting;
    private double annualInterestRate;

    public InterestCalculator(double balance, int yearsInvesting, double annualInterestRate) {
        this.balance = balance;
        this.yearsInvesting = yearsInvesting;
        this.annualInterestRate = annualInterestRate;
    }

    public void calculateNewBalance() {
        int yearsPast = 0;

        while(yearsPast < yearsInvesting) { // so it keeps going for the years investing
            yearsPast++;
            double finalBalance = balance * Math.pow( ((annualInterestRate/4/100)+1), 4); // math calculation, (balance) * (annual interest rate divided by (4*100) + 1), all of that to the power of 4 because it is quarterly, change 4 to amount of times in a year it should compound
            double difference = finalBalance-balance; // calculating difference

//            System.out.println("Began with $" + Math.floor(balance * 100) / 100);
//            System.out.println("Earned $" + Math.floor(difference * 100) / 100); // the * 100 then / 100 is to make it round to 2 decimal places
//            System.out.println("Ended with $" + Math.floor(finalBalance * 100) / 100 + "\n");

            balance = finalBalance; //balance updated so it can calculate the next year
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

    }
}