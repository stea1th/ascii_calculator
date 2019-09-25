package ascii.calculator.templates;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class AbstractSign implements SignInterface {

    static final Integer HEIGHT = 5;
    private static Integer Width;
    private List<Pair<Integer, Integer>> properties = new ArrayList<>();
    private String[][] matrix;

    AbstractSign() {

    }

    void createEmptyMatrix() {
        matrix = new String[HEIGHT][Width];
        for (String[] strings : matrix) {
            Arrays.fill(strings, " ");
        }
    }

    public String[][] getMatrix() {
        return matrix;
    }

    void create() {
        properties.forEach(p-> {
            matrix[p.getKey()][p.getValue()] = "x";
        });
    }

    void addCoordinates(int row, int column) {
        properties.add(new Pair<>(row, column));
    }

    void setCoordinates() {

    }

    public static void setWidth(Integer width) {
        Width = width;
    }
}
