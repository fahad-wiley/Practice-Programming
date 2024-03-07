import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte age;

        while (true) {
            System.out.print("What is your age? ");
            age = Byte.parseByte(sc.nextLine());
            if (age > 0) break;
            System.out.println("Age cannot be negative!");
        }

        int maxHeartRate = 220-age;
        System.out.println("Your maximum heart rate should be " + (maxHeartRate) + " beats per minute.");
        System.out.println("Your target HR Zone is " + ((int) Math.ceil((0.5*maxHeartRate))) + " - " + ((int) Math.ceil(0.85*maxHeartRate)) + " beats per minute.");

    }
}
