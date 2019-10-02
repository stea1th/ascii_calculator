package ascii.calculator.helpers;

import ascii.calculator.exception.CalculatorException;
import javafx.util.Pair;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {

    private StringHelper() {
        throw new CalculatorException("Utility Class");
    }

    private static final String OPERATOR = "[-+*/]+";
    private static final String BODY = "\\d+[.,]*\\d*";

    public static List<Pair<String, BigDecimal>> cutStringToPairs(String expression) {
        List<Pair<String, BigDecimal>> result = new LinkedList<>();
        if (Character.isDigit(expression.charAt(0))) {
            expression = "+" + expression;
        }
        Pattern regex = Pattern.compile(OPERATOR + BODY);
        Matcher matcher = regex.matcher(expression.replace(" ", ""));
        while (matcher.find()) {
            result.add(createPair(matcher.group()));
        }
        return result;
    }

    private static Pair<String, BigDecimal> createPair(String expression) {
        return new Pair<>(expression.replaceFirst(BODY, ""), BigDecimal.valueOf(Double.parseDouble(expression.replaceFirst(OPERATOR, ""))));
    }
}
