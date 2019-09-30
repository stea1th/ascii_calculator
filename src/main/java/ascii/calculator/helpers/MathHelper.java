package ascii.calculator.helpers;

import ascii.calculator.exception.CalculatorException;

import java.util.List;

public class MathHelper {

    private static Integer result;

    private MathHelper() {
        throw new CalculatorException("Utility Class");
    }

    public static Integer compute(List<String> expressions) {
        result = 0;
        for (String ex : expressions) {
            switch (ex.charAt(0)) {
                case '+':
                    addTo(StringHelper.removeNonDigit(ex));
                    break;
                case '-':
                    subtract(StringHelper.removeNonDigit(ex));
                    break;
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
