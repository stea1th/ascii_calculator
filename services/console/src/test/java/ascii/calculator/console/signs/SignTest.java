package ascii.calculator.console.signs;

import ascii.calculator.console.TestDataGenerator;
import ascii.calculator.exception.CalculatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SignTest {

    @Test
    void getMatrix() {

        String[][] matrix = TestDataGenerator.createEmptyMatrix();
        matrix[0][0] = "x";
        matrix[0][1] = "x";
        matrix[0][2] = "x";
        matrix[1][0] = "x";
        matrix[1][2] = "x";

        Sign sign = TestDataGenerator.generateSign();
        assertArrayEquals(matrix, sign.getMatrix());
    }

    @Test
    void create(){
        assertThrows(CalculatorException.class,()-> TestDataGenerator.generateSign(2));

    }
}