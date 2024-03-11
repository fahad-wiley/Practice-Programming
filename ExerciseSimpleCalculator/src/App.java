import java.util.Scanner;

public class App {

    public static double returnAnswer(double a, double b, String op, SimpleCalculator calc) {
        double answer = Double.NEGATIVE_INFINITY; // if answer failed to compute

        switch(op) {
            case "+":
                answer = calc.add(a, b);
                break;

            case "-":
                answer = calc.subtract(a, b);
                break;

            case "*":
                answer = calc.multiply(a, b);
                break;

            case "/":
                answer = calc.divide(a, b);
                break;

        }

        return answer;
    }
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator(); // instantiate SimpleCalculator object
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the first operand? ");
        double firstOperand = Double.parseDouble(sc.nextLine());

        System.out.print("What operator? (+, -, *, /) ");
        String operator = sc.nextLine();

        System.out.print("What is the second operand? ");
        double secondOperand = Double.parseDouble(sc.nextLine());

        double answer = returnAnswer(firstOperand, secondOperand, operator, calc);
        System.out.println("Your answer is : " + answer);
    }
}
