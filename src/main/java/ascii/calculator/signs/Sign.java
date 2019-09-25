package ascii.calculator.signs;

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
        this.properties = properties != null? properties : new ArrayList<>();
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
        properties.forEach(p-> {
            matrix[p.getKey()][p.getValue()] = "x";
        });
    }
}
