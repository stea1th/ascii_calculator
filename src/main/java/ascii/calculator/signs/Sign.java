package ascii.calculator.signs;

import ascii.calculator.exception.CalculatorException;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sign implements SignInterface {

    public static final Integer HEIGHT = 5;
    private Integer width;
    private List<Pair<Integer, Integer>> properties;
    private String[][] matrix;

    public Sign(Integer width, List<Pair<Integer, Integer>> properties) {
        this.width = width;
        createEmptyMatrix();
        this.properties = properties != null ? properties : new ArrayList<>();
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
        properties.forEach(p -> {
            if (p.getKey() >= HEIGHT || p.getValue() >= width) {
                try {
                    throw new CalculatorException("Invalid sign coordinate");
                } catch (CalculatorException e) {
                    System.err.println(e.getMessage());
                    System.exit(-1);
                }
            }
                matrix[p.getKey()][p.getValue()] = "x";
        });
    }
}
