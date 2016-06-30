package kalkulator;

public class CalculatorException extends Exception {
    public CalculatorException() {
        super();
    }

    public CalculatorException(String message) {
        super(message);
    }

    public CalculatorException(Throwable cause) {
        super(cause);
    }

    public CalculatorException(String message, Throwable cause) {
        super(message, cause);
    }
}
