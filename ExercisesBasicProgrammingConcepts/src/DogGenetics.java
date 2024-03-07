import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String dogName = myScanner.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName +"'s prestigious background right here.");

        Random myRng = new Random();
        byte remainingPercentage = 100;
        String[] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"}; // should be less than 127 dog breeds because of byte assignment //ideally this should be shuffled as well
        byte currentIndex = (byte) myRng.nextInt(dogBreeds.length); // randomise where to start, so it's not always the same order of breeds

        for(int i = 0; i < 5; i++) {
            byte percent = (byte) (myRng.nextInt(remainingPercentage) + 1); // randomise a percentage for a dog breed
            remainingPercentage = (byte) (100 - percent);
            System.out.println(percent + "% " + dogBreeds[currentIndex]);
            currentIndex++;
            if (currentIndex == 5) currentIndex = 0; // go back to the start of the list
        }
    }
}
