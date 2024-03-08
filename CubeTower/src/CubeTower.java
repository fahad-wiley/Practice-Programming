import java.util.ArrayList;

public class CubeTower {
    /**
     * THIS IS NOT WORKING YET
     * TODO: FIX THIS
     *
     * Before approaching the problem, I understand that the bigger the length of the cube, the bigger the volume is going to be
     * I understand after some work with the calculator that the larger cubes lead to exponentially larger volumes because of the cubic relationship between length and volume
     * So it would be best to try and use uniform length of cubes to minimise total volume
     */
    public static long calculateMaxVolume(int N, int H) {
        return (long) Math.pow((H - (N-1)), 3); // H-(N-1) basically gets the biggest cubes length by making sure the rest of the cubes will all be 1x1x1 // then it is just cubed to get the volume of it
    }

    public static long calculateMinVolume(int N, int H) {
        // this calculation I am going to try and use the modulo operator if H isn't divisible by N, if it is, I can simply make cubes of that size
        boolean even = H % N == 0; // if it is divisible, then can make all the same size cubes
        long volume;

        if (even) {
            volume = (long) Math.pow((double) H / N, 3) * N; // if even, use the approach that uses same size cubes
        }

        else {
            long mostCommonCube = (H-1) / N;
            volume = (long) Math.pow((double) (H-1) / N, 3) * (N-1); // different from line 17 because at the end it is N-1 leaving space for a smaller cube by 1 length
            volume += (long) Math.pow(mostCommonCube-1, 3);
        }
        return volume;
    }


    public static void main(String[] args) {
        long max = calculateMaxVolume(2, 4);
        long min = calculateMinVolume(2, 4);
        System.out.println(max-min);
    }
}
