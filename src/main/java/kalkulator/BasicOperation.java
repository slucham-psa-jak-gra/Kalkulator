package kalkulator;

public enum BasicOperation implements Operation {
    ADD("+") {
        public double apply(double value1, double value2) {
            return value1 + value2;
        }
    },
    SUB("-") {
        public double apply(double value1, double value2) {
            return value1 - value2;
        }
    },
    MUL("*") {
        public double apply(double value1, double value2) {
            return value1 * value2;
        }
    },
    DIV("/") {
        public double apply(double value1, double value2) {
            return value1 / value2;
        }
    };

    private final String symbol;
    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    public static BasicOperation get(String symbol) {
        for (BasicOperation basicOperation : BasicOperation.values()) {
            if (symbol.equals(basicOperation.symbol)) {
                return basicOperation;
            }
        }
        throw new IllegalArgumentException("Operator not recognized");
    }
}
