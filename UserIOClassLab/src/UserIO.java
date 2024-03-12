import java.util.Scanner;

public class UserIO {
    public interface UserIOInterface {

        void print(String message);

        String readString(String prompt);

        int readInt(String prompt);

        int readInt(String prompt, int min, int max);

        double readDouble(String prompt);

        double readDouble(String prompt, double min, double max);

        float readFloat(String prompt);

        float readFloat(String prompt, float min, float max);

        long readLong(String prompt);

        long readLong(String prompt, long min, long max);

    }
    public void print(String message) {
        System.out.println(message);
    }

    public String readString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public int readInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }

    public int readInt(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int answer;
        do {
            System.out.println(prompt);
            answer = sc.nextInt();
        }
        while(answer > max || answer < min);
        return answer;
    }

    public double readDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public double readDouble(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        double answer;
        do {
            System.out.println(prompt);
            answer = sc.nextDouble();
        }
        while(answer > max || answer < min);
        return answer;
    }

    public float readFloat(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextFloat();
    }

    public float readFloat(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        float answer;
        do {
            System.out.println(prompt);
            answer = sc.nextFloat();
        }
        while(answer > max || answer < min);
        return answer;
    }

    public long readLong(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLong();
    }

    public long readLong(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        long answer;
        do {
            System.out.println(prompt);
            answer = sc.nextLong();
        }
        while(answer > max || answer < min);
        return answer;
    }


    public static void main(String[] args) {

    }
}
