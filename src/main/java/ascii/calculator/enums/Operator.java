package ascii.calculator.enums;

import java.util.EnumSet;

public enum Operator {

    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    EQUALLY("="),
    EMPTY(" "),
    COMMA(","),
    POINT("."),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    ZERO("0");

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
