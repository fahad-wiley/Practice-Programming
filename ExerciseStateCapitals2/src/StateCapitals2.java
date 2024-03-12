import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class StateCapitals2 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, String> stateCapitals = new HashMap<>(); //instantiate the hashmap

        Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\loneo\\Desktop\\wiley\\java\\Practice-Programming\\ExerciseStateCapitals2\\src\\StateCapitals.txt"))); // scanner reads from this file
        Scanner scanner = new Scanner(System.in); // separate scanner for console input


        while (sc.hasNextLine()) {         // go through the file line by line
            String currentLine = sc.nextLine();
            System.out.println("Adding: " + currentLine); // tells console im going to add this
            String[] arr = currentLine.split("::"); // :: is the delimiter used in the text file
            stateCapitals.put(arr[0], arr[1]); // add to the hashmap as state as the key and the capital as the value
        }

        for(String s : stateCapitals.keySet()) { // iterate and print through the key set
            System.out.println(s);
        }

        System.out.println("-----");

        for(String s : stateCapitals.values()) { // iterate and print through the value list
            System.out.println(s);
        }

        System.out.println("-----");
        Random rng = new Random(); // random object for random state generator
        String randomState;

        ArrayList<String> tempArr = new ArrayList<>(stateCapitals.keySet()); // copy the key set into an array, so I can pick a random index for the random state quiz
        randomState = tempArr.get(rng.nextInt(tempArr.size()));

        for(String s : stateCapitals.keySet()) {
            System.out.println("State: " + s + " - Capital: " + stateCapitals.get(s));
        }



        while(true) { // loop until quit
            System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF '" + randomState + "'? ");
            String answer = scanner.nextLine();
            if (answer.equals(stateCapitals.get(randomState))) {
                System.out.println("NICE WORK! " + stateCapitals.get(randomState) + " IS CORRECT!");
            }
            else {
                System.out.println("Unfortunate! " + stateCapitals.get(randomState) + " was the answer!");
            }
            randomState = tempArr.get(rng.nextInt(tempArr.size())); // gets new random state
        }
    }
}
