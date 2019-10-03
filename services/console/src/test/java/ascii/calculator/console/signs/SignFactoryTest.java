package ascii.calculator.console.signs;

import ascii.calculator.console.TestDataGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SignFactoryTest {

    @Test
    void createSign() {
        SignInterface testSign = TestDataGenerator.generateSign(6, TestDataGenerator.generatePlusProperties());
        SignInterface sign = SignFactory.createSign("+");

        assertArrayEquals(testSign.getMatrix(), sign.getMatrix());

    }
}