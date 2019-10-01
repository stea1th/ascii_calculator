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

    public static Integer compute(Multimap<String, Integer> expressions) {
        result = 0;
        boolean isTrue = true;
        while(isTrue) {
            expressions.
        }

//        for (int i = 0; i < expressions.size(); i++) {
//            String ex = expressions.get(i);
//            switch (getOperator(ex.charAt(0))) {
//                case PLUS:
//                    addTo(StringHelper.removeNonDigits(ex));
//                    break;
//                case MINUS:
//                    subtract(StringHelper.removeNonDigits(ex));
//                    break;
//                case MULTIPLY:
//                    multiply()
//
//                default:
//                    doNothing();
//                    break;
//
//            }
//        }
        return result;
    }

    private static void multiply(Integer... digits) {

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
