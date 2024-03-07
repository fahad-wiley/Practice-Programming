public class SummativeSums {
    public static int sumArray(int[] intArr) {
        int counter = 0;
        for(int num : intArr) {
            counter += num;
        }
        return counter;
    }
    public static void main(String[] args) {
        int index = 1;
        int[][] arrayToBeSummed = {
                { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
                { 999, -60, -77, 14, 160, 301 },
                { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }
        };

        for (int[] arr : arrayToBeSummed) {
            System.out.println("#" + index + " Array Sum: " + sumArray(arr));
            index++;
        }


    }
}