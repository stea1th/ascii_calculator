package ascii.calculator.signs;

import ascii.calculator.exception.CalculatorException;
import javafx.util.Pair;

import java.util.*;

public class Sign implements SignInterface {

    public static final Integer HEIGHT = 5;
    private Integer width;
    private Map<Integer, int[]> properties;
    private String[][] matrix;

    Sign(Integer width, Map<Integer, int[]> properties) {
        this.width = width;
        createEmptyMatrix();
        this.properties = properties != null ? properties : new HashMap<>();
        create();
    }

    private void createEmptyMatrix() {
        matrix = new String[HEIGHT][width];
        for (String[] strings : matrix) {
            Arrays.fill(strings, " ");
        }
    }

    public String[][] getMatrix() {
        return matrix;
    }

    private void create() {

        properties.forEach((key, value) -> {
            if (key >= HEIGHT) {
                try {
                    throw new CalculatorException("Invalid height coordinate");
                } catch (CalculatorException e) {
                    System.err.println(e.getMessage());
                    System.exit(-1);
                }
            }
            Arrays.stream(value).forEach(v -> {
                if(v >= width) {
                    try {
                        throw new CalculatorException("Invalid width coordinate");
                    } catch (CalculatorException e) {
                        System.err.println(e.getMessage());
                        System.exit(-1);
                    }
                }
                matrix[key][v] = "x";
            });
        });
    }
}
