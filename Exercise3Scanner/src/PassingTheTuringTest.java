import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {

        String name, colour, favFruit, favNumber;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.println("What's your name?");
        name = inputReader.nextLine();

        System.out.println("Hi, " + name + "! I'm Alice.");
        System.out.println("What's your favorite color?");
        colour = inputReader.nextLine();

        System.out.println("Huh, " + colour + "? Mine's Electric Lime.");
        System.out.println("I really like limes. They're my favorite fruit, too.");

        System.out.println("What's YOUR favorite fruit, " + name + "?");
        favFruit = inputReader.nextLine();

        System.out.println("Really? " + favFruit + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number?");
        favNumber = inputReader.nextLine();

        System.out.println(favNumber + " is a cool number. Mine's -7");
        System.out.println("Did you know 42 * -7 is -294? That's a cool number too!");

        System.out.println("Well, thanks for talking to me, " + name + "!");
    }
}
