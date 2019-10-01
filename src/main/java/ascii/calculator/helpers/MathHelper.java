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

    private static List<Pair<String, Integer>> turnMultiplyAndDivide(List<Pair<String, Integer>> expressions) {
        boolean isTrue = true;
        while(isTrue) {
            isTrue = false;
            for (int i = 0; i <expressions.size() ; i++) {
                Pair<String, Integer> pair = expressions.get(i);
                String action = pair.getKey();
                if(getOperator(action).equals(MULTIPLY)) {


                }
            }

        }
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
