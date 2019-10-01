package ascii.calculator.enums;

import java.util.EnumSet;

public enum Operator {

    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*');

    public final char label;

    Operator(char label) {
        this.label = label;
    }

    public static Operator getOperator(char sign) {
        EnumSet<Operator> allOperators = EnumSet.allOf(Operator.class);
        return allOperators.stream().filter(i-> i.label == sign)
                .findFirst()
                .orElse(null);
    }
}
