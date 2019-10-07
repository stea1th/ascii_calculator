package ascii.calculator.helpers;

import ascii.calculator.exception.CalculatorException;
import javafx.util.Pair;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {

    private StringHelper() {
        throw new CalculatorException("Utility Class");
    }

    private static final String OPERATOR = "[-+*/]";
    private static final String BODY = "\\d+[.,]*\\d*";
    private static final String BODY_WITH_MINUS = "-?\\d+[.,]*\\d*";

    public static List<Pair<String, BigDecimal>> cutStringToPairs(String expression) {
        List<Pair<String, BigDecimal>> result = new LinkedList<>();
        expression = replaceComma(expression);
        if (Character.toString(expression.charAt(0)).equals(".")) {
            expression = "0" + expression;
        }
        if (Character.isDigit(expression.charAt(0))) {
            expression = "+" + expression;
        }
        Pattern regex = Pattern.compile(OPERATOR + BODY_WITH_MINUS);
        Matcher matcher = regex.matcher(expression.replace(" ", ""));
        while (matcher.find()) {
            result.add(createPair(matcher.group()));
        }
        return result;
    }

    private static Pair<String, BigDecimal> createPair(String expression) {
        String sign = expression.replaceFirst(expression.replaceFirst(BODY, "").length() > 1 ? BODY_WITH_MINUS : BODY, "");
        return new Pair<>(sign,
                BigDecimal.valueOf(Double.parseDouble(expression.replaceFirst(OPERATOR, ""))));
    }

    public static String formatResult(String expression, BigDecimal computed) {
        return expression + " = " + onlyResult(computed);
    }

    public static String onlyResult(BigDecimal computed) {
        DecimalFormat format = new DecimalFormat("0.##");
        return format.format(computed.setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    public static String formatResult(BigDecimal computed) {
        return formatResult("", computed);
    }

    private static String replaceComma(String expression) {
        return expression.replace(",", ".");
    }
}
