package ascii.calculator.helpers;

import ascii.calculator.exception.CalculatorException;
import com.google.common.collect.Multimap;
import javafx.util.Pair;

import java.util.Arrays;
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

    public static List<Pair<String, Integer>> cutStringToPairs(String expression) {
        List<Pair<String, Integer>> result = new LinkedList<>();
        if (Character.isDigit(expression.charAt(0))) {
            expression = "+" + expression;
        }
        Pattern regex = Pattern.compile(OPERATOR + BODY);
        Matcher matcher = regex.matcher(expression.replace(" ", ""));
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
            result.add(createPair(group));
        }
        return result;
    }

    static Integer[] removeNonDigits(String... expression) {
        return Arrays.stream(expression)
                .map(i -> Integer.valueOf(i.replaceFirst(OPERATOR, "")))
                .toArray(Integer[]::new);
    }

    private static Pair<String, Integer> createPair(String expression) {
        return new Pair<>(expression.replaceFirst(BODY, ""), Integer.valueOf(expression.replaceFirst(OPERATOR, "")));
    }
}
