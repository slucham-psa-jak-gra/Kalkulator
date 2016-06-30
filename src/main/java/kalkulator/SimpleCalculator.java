package kalkulator;

public final class SimpleCalculator implements Calculator {
    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";

    @Override
    public double calculate(String expression) throws CalculatorException {
        String[] tokens = expression.split("\\s");
        if (tokens.length != 3) {
            throw new CalculatorException(new IllegalArgumentException("Illegal number of tokens"));
        }
        double value1, value2, result;
        try {
            value1 = Double.parseDouble(tokens[0]);
            value2 = Double.parseDouble(tokens[2]);
        } catch (NumberFormatException e) {
            throw new CalculatorException(e);
        }
        if (tokens[1].equals(ADD)) {
            result = value1 + value1;
        }
        else if (tokens[1].equals(SUB)) {
            result = value1 - value2;
        }
        else if (tokens[1].equals(MUL)) {
            result = value1 * value2;
        }
        else if (tokens[1].equals(DIV)) {
            if (value2 == 0) {
                throw new CalculatorException("Cannot divide by 0");
            }
            result = value1 / value2;
        }
        else {
            throw new CalculatorException("Operator not recognized");
        }

        return result;
    }
}
