package ascii.calculator.console.helpers;

import ascii.calculator.console.signs.SignFactory;
import ascii.calculator.console.signs.SignInterface;
import ascii.calculator.exception.CalculatorException;

import java.util.List;
import java.util.stream.Collectors;

import static ascii.calculator.console.signs.Sign.HEIGHT;

public class SignHelper {

    private SignHelper() {
        throw new CalculatorException("Utility Class");
    }

    public static void printResult(List<SignInterface> result) {
        for (int i = 0; i < HEIGHT; i++) {
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
        return result.codePoints().mapToObj(i -> SignFactory.createSign(String.valueOf((char) i)))
                .collect(Collectors.toList());
    }
}
