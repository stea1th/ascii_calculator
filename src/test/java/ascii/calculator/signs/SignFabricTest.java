package ascii.calculator.signs;

import ascii.calculator.TestDataGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SignFabricTest {

    @Test
    void createSign() {
        SignInterface testSign = TestDataGenerator.generateSign(6, TestDataGenerator.generatePlusProperties());
        SignInterface sign = SignFabric.createSign('+');

        assertArrayEquals(testSign.getMatrix(), sign.getMatrix());

    }
}