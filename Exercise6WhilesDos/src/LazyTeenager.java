import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {

        int count = 0;
        Random rng = new Random();
        int currentChance = 0;
        int randomNumber = 0;
        do {
            if (currentChance == 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            count++;
            System.out.println("Clean your room!! (x" + count + ")");
            currentChance++;
            randomNumber = rng.nextInt(101);

        } while (!(randomNumber < (currentChance*10)));
        if ((randomNumber < (currentChance*10))) System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
    }
}