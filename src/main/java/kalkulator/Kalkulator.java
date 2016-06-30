package kalkulator;

public class Kalkulator {
    private final Calculator calculator;
    private final InputProvider inputProvider;

    public Kalkulator() {
        this.calculator = new RPNCalculator();
        this.inputProvider = new ConsoleInputProvider();
    }

    public void run() {
        while (true) {
            String input = inputProvider.next();
            double result;
            try {
                result = calculator.calculate(input);
                System.out.println("Wynik: " + result);
            } catch (CalculatorException e) {
                System.out.println("Blad, nie udalo sie obliczyc wyrazenia" + input);
            }
        }
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.run();
    }
}
