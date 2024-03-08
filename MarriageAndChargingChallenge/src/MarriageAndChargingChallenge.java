public class MarriageAndChargingChallenge {
    /**
     * Pretty sure this method is solved with a time complexity of O(n), although I can't think of a way to solve it O(n^2)
     *  Overall, it should be O(n^2) time complexity since we are iterating through the initial arrays once and computing on each of them
     *
     * @param forumLength circumference of the circle in arbitrary measurement
     * @param relative the 'location or co-ords' of the next dear relative
     * @param greeting the seconds of greeting, also charging phone for this amount of time
     * @param index which starting position we are checking with this method call
     * @return it should return false if seconds of charge run out, and return true if the phone doesn't run out of charge
     */

    public static boolean checkCoOrd(int forumLength, int[] relative, int[] greeting, int index) {
        int secondsOfCharge = greeting[index]; // starts with whatever index seconds of charge

        for(int i = index; i < relative.length/2; i++) { // 'i' starts at index, to test that particular starting position // only while i < relative.length/2 because I doubled the array to avoid index out-of-bounds exception
            int distanceToGo = (i == (relative.length-1)/2) ? forumLength : (relative[i+1] - relative[i]); // so this checks if we are on the last relative in terms of position/co-ords, if we are, we should know that the next journey will be the forum length - the location // otherwise just the distance till the next relative
            if (secondsOfCharge < distanceToGo) { // if we don't have enough seconds of charge during the journey
                return false; // return with a false showing that the starting position is not viable
            }
            forumLength -= relative[i]; // keeps track of forum length, there are other ways to do this also // TODO: check of another way implementing distanceToGo
            secondsOfCharge -= (relative[i+1] - relative[i]);
            secondsOfCharge += greeting[i+1]; // add on the seconds gained from the greeting
        }
        return true; // return true if for loop concludes without returning false as we have made a full circle
    }
    public static void main(String[] args) {
        int forumLength = 1000000;
        int[] relative = {42, 47};
        int[] greeting = {6, 999994};



        // This section below simply doubles the array so the program avoids index out-of-bounds exception when checking relative[i+1]
        // Got this from online
        int[] extendedRelative = new int[relative.length * 2];
        int[] extendedGreeting = new int[greeting.length * 2];

        System.arraycopy(relative, 0, extendedRelative, 0, relative.length);
        System.arraycopy(greeting, 0, extendedGreeting, 0, greeting.length);

        System.arraycopy(relative, 0, extendedRelative, relative.length, relative.length);
        System.arraycopy(greeting, 0, extendedGreeting, greeting.length, greeting.length);


        int counter = 0; // keep track of how many times true is returned
        for(int i = 0; i < relative.length; i++) {
            if (checkCoOrd(forumLength, extendedRelative, extendedGreeting, i)) counter++; // if true is returned, increment counter
        }

        System.out.println(counter);

    }
}
