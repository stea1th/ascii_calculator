package ascii.calculator.helpers;

import ascii.calculator.exception.CalculatorException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {

    private StringHelper() {
        throw new CalculatorException("Utility Class");
    }

    private static final String REGEX = "[-+*:]+";

    public static List<String> cutStringToPairs(String expression) {
        List<String> result = new ArrayList<>();
        if (Character.isDigit(expression.charAt(0))) {
            expression = "+" + expression;
        }
        Pattern regex = Pattern.compile(REGEX + "\\d+[.,]*\\d*");
        Matcher matcher = regex.matcher(expression.replace(" ", ""));
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }

    static Integer removeNonDigit(String expression) {
        return Integer.valueOf(expression.replaceFirst(REGEX, ""));
    }

}
