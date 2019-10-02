package ascii.calculator.helpers;

import ascii.calculator.enums.Operator;
import ascii.calculator.exception.CalculatorException;
import com.google.common.collect.Multimap;
import javafx.util.Pair;

import java.util.List;

import static ascii.calculator.enums.Operator.*;

public class MathHelper {

    private static Integer result;

    private MathHelper() {
        throw new CalculatorException("Utility Class");
    }

    public static Integer compute(List<Pair<String, Integer>> expressions) {
        result = 0;

        multiplyAndDivideTurn(expressions).forEach(i -> {
            switch (getOperator(i.getKey())) {
                case PLUS:
                    addTo(i.getValue());
                    break;
                case MINUS:
                    subtract(i.getValue());
                    break;
                default:
                    doNothing();
                    break;
            }
        });
        System.out.println(result);
        return result;
    }

    private static List<Pair<String, Integer>> multiplyAndDivideTurn(List<Pair<String, Integer>> expressions) {
        boolean isTrue = true;
        while (isTrue) {
            isTrue = false;
            Integer index = findIndex(expressions);
            if (index != null) {
                isTrue = true;
                Pair<String, Integer> firstPair = expressions.get(index - 1);
                Pair<String, Integer> secondPair = expressions.get(index);
                Integer result = multiply(firstPair.getValue(), secondPair.getValue());
                expressions.remove(firstPair);
                expressions.remove(secondPair);
                expressions.add(index - 1, new Pair<>(firstPair.getKey(), result));
            }
        }
        return expressions;
    }

    private static Integer findIndex(List<Pair<String, Integer>> expressions) {
        for (int i = 0; i < expressions.size(); i++) {
            Pair<String, Integer> pair = expressions.get(i);
            Operator operator = getOperator(pair.getKey());
            if (operator.equals(MULTIPLY)) {
                return i;
            }
        }
        return null;
    }

    private static Integer multiply(Integer first, Integer second) {
        return first * second;

    }

    private static void addTo(Integer... digits) {
        result += digits[0];
    }

    private static void subtract(Integer... digits) {
        result -= digits[0];
    }

    private static void doNothing() {

    }


}
