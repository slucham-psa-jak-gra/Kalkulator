package kalkulator;

public final class SimpleCalculator implements Calculator {
    @Override
    public double calculate(String expression) throws CalculatorException {
        String[] tokens = expression.split("\\s");
        if (tokens.length != 3) {
            throw new CalculatorException("Illegal number of tokens");
        }
        double value1, value2, result;
        Operation operation;
        try {
            value1 = Double.parseDouble(tokens[0]);
            value2 = Double.parseDouble(tokens[2]);
            operation = BasicOperation.get(tokens[1]);
            result = operation.apply(value1, value2);
        } catch (IllegalArgumentException e) {
            throw new CalculatorException(e);
        }

        return result;
    }
}
