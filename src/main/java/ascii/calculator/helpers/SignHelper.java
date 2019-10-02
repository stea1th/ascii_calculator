package ascii.calculator.helpers;

import ascii.calculator.exception.CalculatorException;
import ascii.calculator.signs.Sign;
import ascii.calculator.signs.SignInterface;

import java.util.List;
import java.util.stream.Collectors;

import static ascii.calculator.signs.SignFactory.createSign;

public class SignHelper {

    private SignHelper() {
        throw new CalculatorException("Utility Class");
    }

    public static void printResult(List<SignInterface> result) {
        for (int i = 0; i < Sign.HEIGHT; i++) {
            int finalI = i;
            result.forEach(o -> {
                String[][] matrix = o.getMatrix();
                for (int j = 0; j < matrix[finalI].length; j++) {
                    System.out.print(matrix[finalI][j]);
                }
            });
            System.out.println();
        }
    }

    public static List<SignInterface> transformToList(String result) {
        return result.codePoints().mapToObj(i -> createSign(String.valueOf((char) i)))
                .collect(Collectors.toList());
    }
}
