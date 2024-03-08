import java.util.ArrayList;
import java.util.Arrays;

public class GalleryIllumination {
    public static void illuminateX(ArrayList<String> arr, ArrayList<ArrayList<Integer>> coOrds, int rows, int cols, int i, int j) {

        for(int goRight = j; goRight < arr.get(i).length(); goRight++) { // goes right from the lamp
            if (!(arr.get(i).charAt(goRight) == '#')) { // as long as you don't hit another wall // if it hits another lamp, it can't remove from co ords array anyways
                ArrayList<Integer> temp = new ArrayList<>(); //creates a temporary matching object
                temp.add(i);
                temp.add(goRight);
                coOrds.remove(temp); // remove them from the list of dark squares
            }
        }

        for(int goLeft = j; goLeft >= 0; goLeft--) { // goes left from the lamp
            if (!(arr.get(i).charAt(goLeft) == '#')) { // as long as you don't hit another wall
                ArrayList<Integer> temp = new ArrayList<>(); //creates a temporary matching object
                temp.add(i);
                temp.add(goLeft);
                coOrds.remove(temp); // remove them from the list of dark squares
            }
        }
    }

    public static void illuminateY(ArrayList<String> arr, ArrayList<ArrayList<Integer>> coOrds, int rows, int cols, int i, int j) {

        for(int goUp = i; goUp >= 0; goUp--) { // goes up from the lamp
            if (!(arr.get(i).charAt(goUp) == '#')) { // as long as you don't hit another wall
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(goUp);
                temp.add(j);
                coOrds.remove(temp);
            }
        }

        for(int goDown = i; goDown < rows; goDown++) { // goes down from the lamp
            if (!(arr.get(i).charAt(goDown) == '#')) { // as long as you don't hit another wall
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(goDown);
                temp.add(j);
                coOrds.remove(temp);
            }
        }
    }
    public static void illuminate(ArrayList<String> arr, ArrayList<ArrayList<Integer>> coOrds, int rows, int cols) {
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.get(i).length(); j++) {
                if (arr.get(i).charAt(j) == '.') {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    coOrds.add(temp); // add the co ords of the dark squares in the form of a length = 2 integer arraylist
                }
            }
        }

        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.get(i).length(); j++) {
                if (arr.get(i).charAt(j) == 'O') { // if a lamp is found, call the methods that will 'illuminate'
                    illuminateX(arr, coOrds, rows, cols, i, j);
                    illuminateY(arr, coOrds, rows, cols, i, j);
                }
            }
        }

    }

    public static int countDarkCells(ArrayList<String> arr, ArrayList<ArrayList<Integer>> coOrds, int rows, int cols) {
        illuminate(arr, coOrds, rows, cols);
        int counter = 0;
        for(String s : arr) { // go through each string
            for(int i = 0; i < s.length(); i++) { // go through each char
                if (s.charAt(i) == '.') counter++; // if char is '.' representing a dark square, counter will increment
            }
        }
        return counter; // return number of dark squares
    }
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;

        String[] arrTemp = {
                ".....",
                ".O...",
                "..O..",
                "....."
        };

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(arrTemp));
        ArrayList<ArrayList<Integer>> coOrds = new ArrayList<>();

        System.out.println(coOrds);
        System.out.println(countDarkCells(arr, coOrds , rows, cols));
        System.out.println(coOrds);
        System.out.println(coOrds.size());

    }
}
