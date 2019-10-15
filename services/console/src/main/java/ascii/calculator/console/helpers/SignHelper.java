package ascii.calculator.console.helpers;

import ascii.calculator.console.signs.SignFactory;
import ascii.calculator.console.signs.SignInterface;
import ascii.calculator.exception.CalculatorException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static ascii.calculator.console.signs.Sign.HEIGHT;

public class SignHelper {

    private SignHelper() {
        throw new CalculatorException("Utility Class");
    }

    public static void printResult(List<SignInterface> result) {
        for (int i = 0; i < HEIGHT; i++) {
            for (SignInterface o : result) {
                String[][] matrix = o.getMatrix();
                Arrays.stream(matrix[i]).forEach(System.out::print);
            }
            System.out.println();
        }
    }

    public static void printResult(String[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static List<SignInterface> transformToList(String result) {
        return result.codePoints().mapToObj(i -> SignFactory.createSign(String.valueOf((char) i)))
                .collect(Collectors.toList());
    }

    public static String[] transformStringToArray(String result) {
        return transformListToArray(transformToList(result));
    }

    public static String[] transformListToArray(List<SignInterface> list) {
        String[] arr = new String[HEIGHT];
        for (int i = 0; i < HEIGHT ; i++) {
            StringBuilder res = new StringBuilder();
            for(SignInterface signInterface : list) {
                String[][] matrix = signInterface.getMatrix();
                res.append(String.join("", matrix[i]));
            }
            arr[i] = res.toString();
        }
        return arr;
    }
}
