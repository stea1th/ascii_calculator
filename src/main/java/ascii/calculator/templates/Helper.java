package ascii.calculator.templates;

import java.util.List;

public class Helper {

    public static void printResult(List<Interf> result) {
        for (int i = 0; i < AbstractSign.HEIGHT; i++) {
            int finalI = i;
            result
                    .forEach(o -> {
                        String[][] matrix = o.getMatrix();
                        for (int j = 0; j < AbstractSign.WIDTH; j++) {
                            System.out.print(matrix[finalI][j]);
                        }
                    });
            System.out.println();
        }
    }
}
