public class App {
    public static void main(String[] args) {

        Factoriser myFactoriser = new Factoriser(6);
        myFactoriser.factorNumber();
        myFactoriser.prettyPrint();
        System.out.println(Factoriser.numberOfFactoriserInstances);

        Factoriser myFactoriser2 = new Factoriser(12);
        myFactoriser2.factorNumber();
        myFactoriser2.prettyPrint();
        System.out.println(Factoriser.numberOfFactoriserInstances);

        System.out.println("-------------------------");

        InterestCalculator calc = new InterestCalculator(200, 5, 10);
        System.out.println(calc.getBalance());
        calc.calculateNewBalance();
        System.out.println(calc.getBalance());
    }
}
