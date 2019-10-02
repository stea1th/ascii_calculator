package ascii.calculator.helpers;

import ascii.calculator.enums.Operator;
import ascii.calculator.exception.CalculatorException;
import javafx.util.Pair;

import java.math.BigDecimal;
import java.util.List;

import static ascii.calculator.enums.Operator.*;

public class MathHelper {

    private static BigDecimal result;

    private MathHelper() {
        throw new CalculatorException("Utility Class");
    }

    public static BigDecimal compute(List<Pair<String, BigDecimal>> expressions) {
        return plusOrMinusTurn(multiplyOrDivideTurn(expressions));
    }

    private static List<Pair<String, BigDecimal>> multiplyOrDivideTurn(List<Pair<String, BigDecimal>> expressions) {
        boolean isTrue = true;
        while (isTrue) {
            isTrue = false;
            Integer index = findIndex(expressions);
            if (index != null) {
                isTrue = true;
                Pair<String, BigDecimal> firstPair = expressions.get(index - 1);
                Pair<String, BigDecimal> secondPair = expressions.get(index);
                expressions.remove(firstPair);
                expressions.remove(secondPair);

                expressions.add(index - 1,
                        new Pair<>(firstPair.getKey(), getOperator(secondPair.getKey()).equals(MULTIPLY) ?
                                firstPair.getValue().multiply(secondPair.getValue()) :
                                firstPair.getValue().divide(secondPair.getValue(), 2)));
            }
        }
        return expressions;
    }

    private static BigDecimal plusOrMinusTurn(List<Pair<String, BigDecimal>> expressions) {
        result = BigDecimal.ZERO;

        expressions.forEach(i -> {
            switch (getOperator(i.getKey())) {
                case PLUS:
                    result = result.add(i.getValue());
                    break;
                case MINUS:
                    result = result.subtract(i.getValue());
                    break;
                default:
                    break;
            }
        });
        return result;
    }

    private static Integer findIndex(List<Pair<String, BigDecimal>> expressions) {
        for (int i = 0; i < expressions.size(); i++) {
            Pair<String, BigDecimal> pair = expressions.get(i);
            Operator operator = getOperator(pair.getKey());
            if (operator.equals(MULTIPLY) || operator.equals(DIVIDE)) {
                return i;
            }
        }
        return null;
    }
}
