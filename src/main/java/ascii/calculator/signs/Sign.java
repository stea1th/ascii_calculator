package ascii.calculator.signs;

import ascii.calculator.exception.CalculatorException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sign implements SignInterface {

    public static final Integer HEIGHT = 5;
    private Integer width;
    private Map<Integer, int[]> properties;
    private String[][] matrix;

    public Sign(Integer width, Map<Integer, int[]> properties) {
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

        properties.forEach((key, value) -> Arrays.stream(value).forEach(v -> {
            try{
                matrix[key][v] = "x";
            } catch (Exception e) {
                throw new CalculatorException("Invalid width coordinate");
            }
        }));
    }
}
