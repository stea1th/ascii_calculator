package ascii.calculator.helpers;

import ascii.calculator.signs.Sign;
import ascii.calculator.signs.SignFabrik;
import ascii.calculator.signs.SignInterface;

import java.util.List;
import java.util.stream.Collectors;

public class SignHelper {

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

        return result.chars().mapToObj(i -> SignFabrik.createSign((char) i))
                .collect(Collectors.toList());
    }
}
