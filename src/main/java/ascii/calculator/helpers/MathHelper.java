package ascii.calculator.helpers;

import java.util.List;

public class MathHelper {

    private static Integer result;


    public static Integer compute(List<String> expressions) {
        result = 0;
        for (String ex : expressions) {
            switch (ex.charAt(0)) {
                case '+':
                    addTo(StringHelper.removeNonDigit(ex));
                    break;
                case '-':
                    substract(StringHelper.removeNonDigit(ex));
                    break;
            }
        }
        return result;
    }

    private static void addTo(int digit) {
        result += digit;
    }

    private static void substract(int digit) {
        result -= digit;
    }


}
