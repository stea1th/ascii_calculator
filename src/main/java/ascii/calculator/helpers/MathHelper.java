package ascii.calculator.helpers;

import ascii.calculator.enums.Operator;
import ascii.calculator.exception.CalculatorException;

import java.util.List;

import static ascii.calculator.enums.Operator.*;

public class MathHelper {

    private static Integer result;

    private MathHelper() {
        throw new CalculatorException("Utility Class");
    }

    public static Integer compute(List<String> expressions) {
        result = 0;
        for (String ex : expressions) {
            switch (getOperator(ex.charAt(0))) {
                case PLUS:
                    addTo(StringHelper.removeNonDigit(ex));
                    break;
                case MINUS:
                    subtract(StringHelper.removeNonDigit(ex));
                    break;
                case MULTIPLY:
                default:
                    doNothing();
                    break;

            }
        }
        return result;
    }

    private static void addTo(int digit) {
        result += digit;
    }

    private static void subtract(int digit) {
        result -= digit;
    }

    private static void doNothing() {

    }


}
