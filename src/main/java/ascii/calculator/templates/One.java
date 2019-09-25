package ascii.calculator.templates;

public class One extends AbstractSign {

    public String[][] createNumber() {
        matrix[0][4] = "x";
        matrix[1][2] = "x";
        matrix[1][4] = "x";
        matrix[2][0] = "x";
        matrix[2][4] = "x";
        matrix[3][4] = "x";
        matrix[4][4] = "x";
        return matrix;
    }


}
