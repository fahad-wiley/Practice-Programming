import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int numberToCountDownFrom;

        while (true) {

            System.out.print("What whole number should I count down from? ");
            numberToCountDownFrom = Integer.parseInt(myScanner.nextLine());
            if (numberToCountDownFrom>0) break;
            System.out.println("The input isn't a positive integer. Please retry!");
        }
        int i = 0;
        while (numberToCountDownFrom >= 0) {
            System.out.print(numberToCountDownFrom-- + " ");
            i++;

            if (i % 10 == 0) System.out.println();
        }
    }
}
