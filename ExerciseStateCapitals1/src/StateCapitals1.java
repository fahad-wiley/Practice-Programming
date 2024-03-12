import java.util.HashMap;

public class StateCapitals1 {
    public static void main(String[] args) {
        HashMap<String, String> stateCapitals = new HashMap<>(); //instantiate the hashmap

        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");


        for(String s : stateCapitals.keySet()) {
            System.out.println(s);
        }

        System.out.println("-----");

        for(String s : stateCapitals.values()) {
            System.out.println(s);
        }

        System.out.println("-----");

        for(String s : stateCapitals.keySet()) {
            System.out.println("State: " + s + " - Capital: " + stateCapitals.get(s));
        }
    }
}
