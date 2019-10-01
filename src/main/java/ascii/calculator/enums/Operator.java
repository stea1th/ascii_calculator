package ascii.calculator.enums;

import java.util.EnumSet;

public enum Operator {

    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*");

    public final String label;

    Operator(String label) {
        this.label = label;
    }

    public static Operator getOperator(String sign) {
        EnumSet<Operator> allOperators = EnumSet.allOf(Operator.class);
        return allOperators.stream().filter(i-> i.label.equals(sign))
                .findFirst()
                .orElse(null);
    }
}
