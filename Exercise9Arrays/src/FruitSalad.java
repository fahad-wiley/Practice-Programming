public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        String[] berries = new String[fruit.length];
        String[] fruitSalad = new String[12];

        int appleCount = 0;
        int orangeCount = 0;
        int fruitCount = 0;
        int currentIndex = 0;
        int berriesIndex = 0;

        String lastFruitAdded = "";
        boolean shouldAddOtherFruit = false;

        while(fruitCount < 12) {



            for (int i = fruitSalad.length - 1; i >= 0; i--) {
                if (fruitSalad[i] == null) continue;
                if (fruitSalad[i].equals(lastFruitAdded)) shouldAddOtherFruit = true;
                else { lastFruitAdded = fruit[i]; }
            }


            for (int i = fruit.length - 1; i >= 0; i--) { // looking for all berries and adding to berries array
                if (fruit[i].contains("tomato")) continue;

                if (fruit[i].contains("berry")) {
                    berries[berriesIndex] = fruit[i];
                    fruit[i] = "skip";
                    berriesIndex++;
                }
            }

            for (String berry : berries) { // prioritising all berries to add to fruit salad before checking fruit array
                if (berry==null) break;
                fruitSalad[currentIndex] = berry;
                fruitCount++;
                currentIndex++;
            }

            outer:
            for (int i = fruit.length - 1; i >= 0; i--) {
                if (fruitCount == 12) break outer;
                if (fruit[i].equals("skip")) continue;

                if (fruit[i].toLowerCase().contains("tomato")) continue outer;

                if (fruit[i].toLowerCase().contains("berry")) {
                    fruitCount++;
                    fruitSalad[currentIndex] = fruit[i];
                    currentIndex++;
                    fruit[i] = "skip";
                    continue outer;
                }
                if (fruit[i].toLowerCase().contains("orange") && orangeCount <= 2) {
                    fruitCount++;
                    orangeCount++;
                    fruitSalad[currentIndex] = fruit[i];
                    currentIndex++;
                    fruit[i] = "skip";
                    continue outer;
                }
                if (fruit[i].toLowerCase().contains("apple") && appleCount <= 3) {
                    fruitCount++;
                    appleCount++;
                    fruitSalad[currentIndex] = fruit[i];
                    currentIndex++;
                    fruit[i] = "skip";
                    continue outer;
                }
                if (shouldAddOtherFruit) {
                    fruitCount++;
                    fruitSalad[currentIndex] = fruit[i];
                    currentIndex++;
                    fruit[i] = "skip";
                }


                }
            }

        for (String s : fruitSalad) { // show all fruit
            System.out.print(s + ", ");
        }

    }
}