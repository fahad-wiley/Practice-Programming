import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class StateCapitalsApp {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Capital> stateCapitals = new HashMap<>(); //instantiate the hashmap
        Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\loneo\\Desktop\\wiley\\java\\Practice-Programming\\ExerciseStateCapitals3\\src\\MoreStateCapitals.txt"))); // scanner reads from this file

        while (sc.hasNextLine()) { // go through the file line by line
            String currentLine = sc.nextLine();
            System.out.println("Adding: " + currentLine); // tells console im going to add this
            String[] arr = currentLine.split("::"); // :: is the delimiter used in the text file
            Capital tempObj = new Capital(arr[1], arr[2], Double.parseDouble(arr[3]));
            stateCapitals.put(arr[0], tempObj); // add to the hashmap as state name as the key and the Capital object as the value
        }

        for(String s : stateCapitals.keySet()) {
            System.out.println("State is: " + s + ", Capital is: " + stateCapitals.get(s).getName() + ", Population is : " + stateCapitals.get(s).getPopulation() + ", Square Miles is : " + stateCapitals.get(s).getSqrMiles());
        }

    }
}
