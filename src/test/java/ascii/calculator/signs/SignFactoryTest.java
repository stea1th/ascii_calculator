package ascii.calculator.signs;

import ascii.calculator.TestDataGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignFactoryTest {

    @Test
    void createSign() {
        SignInterface testSign = TestDataGenerator.generateSign(6, TestDataGenerator.generatePlusProperties());
        SignInterface sign = SignFactory.createSign("+");

        assertArrayEquals(testSign.getMatrix(), sign.getMatrix());

    }
}