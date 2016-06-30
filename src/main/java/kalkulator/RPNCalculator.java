package kalkulator;

import java.util.ArrayDeque;
import java.util.Deque;

public final class RPNCalculator implements Calculator {
    @Override
    public double calculate(String expression) throws CalculatorException {
        Deque<Double> stack = new ArrayDeque<>();
        String[] tokens = expression.split("\\s");
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.add(Double.parseDouble(token));
            }
            else {
                if (stack.size() < 2) {
                    throw new CalculatorException("Illegal expression");
                }
                double value2 = stack.pollLast();
                double value1 = stack.pollLast();
                double result;
                try {
                    Operation operation = BasicOperation.get(token);
                    result = operation.apply(value1, value2);
                } catch (IllegalArgumentException e) {
                    throw new CalculatorException(e);
                }
                stack.add(result);
            }
        }
        if (stack.size() != 1) {
            throw new CalculatorException("Illegal expression");
        }
        return stack.poll();
    }

    private boolean isNumber(String token) {
        try {
            double number = Double.parseDouble(token);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
