import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        final byte THECHOSENNUMBER = 42;

        int pickedNumber;

        while(true) {

            System.out.println("Pick a whole number, por favor.");
            pickedNumber = Integer.parseInt(myScanner.nextLine());

            System.out.println("Your guess: " + pickedNumber);
            System.out.print(pickedNumber + "? ");

            if(pickedNumber < THECHOSENNUMBER) {

                System.out.println("Ha, nice try - too low! I chose " + THECHOSENNUMBER + ".");

            } else if (pickedNumber > THECHOSENNUMBER) {

                System.out.println("Too bad, way too high. I chose " + THECHOSENNUMBER + ".");

            }
            else {
                System.out.println("Wow, nice guess! That was it!");
                break;
            }


        }


    }
}
