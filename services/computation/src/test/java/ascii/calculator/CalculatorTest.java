package ascii.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void main() {
        String[] args = new String[]{"6 + 5/3.2 - 7 +4 -0 / 1-9*3+8"};
        Calculator.main(args);
    }
}