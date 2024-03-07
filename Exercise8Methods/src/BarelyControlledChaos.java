import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = randomColour(); // call color method here
        String animal = randomAnimal(); // call animal method again here
        String colorAgain = randomColour(); // call color method again here
        int weight = randomInt(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = randomInt(10, 20); // call number method,
        // with a range between 10 - 20
        int number = randomInt(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = randomInt(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String randomColour() {
        Random rand = new Random();
        String[] arr = {"blue", "green", "red", "yellow", "magenta"};

        return arr[rand.nextInt(5)];
    }

    public static String randomAnimal() {
        Random rand = new Random();
        String[] arr = {"dog", "cat", "eagle", "dove", "whale"};

        return arr[rand.nextInt(5)];
    }

    public static int randomInt(int min, int max) {
        Random rand = new Random();

        return rand.nextInt(max - min + 1) + min;
    }
}