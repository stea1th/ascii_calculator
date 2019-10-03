package ascii.calculator.helpers;

import ascii.calculator.TestDataGenerator;
import ascii.calculator.signs.Sign;
import ascii.calculator.signs.SignInterface;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static ascii.calculator.helpers.SignHelper.printResult;
import static ascii.calculator.helpers.SignHelper.transformToList;
import static org.junit.jupiter.api.Assertions.*;

class SignHelperTest {

    private static  Sign sign;
    private static List<SignInterface> list;

    @BeforeAll
    static void init() {
        sign = TestDataGenerator.generateSign(6, TestDataGenerator.generatePlusProperties());
        list = new ArrayList<>();
        list.add(sign);
        list.add(sign);
    }

    @Test
    void printResultTest() {
        PrintStream stream = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        printResult(list);
        System.setOut(stream);
        String output = new String(baos.toByteArray());
        assertTrue(output.contains("xxxxx xxxxx "));
    }

    @Test
    void transformToListTest() {
        String test = "+";
        List<SignInterface> signInterfaces = transformToList(test);
        assertEquals(1, signInterfaces.size());
        assertArrayEquals(sign.getMatrix(), signInterfaces.get(0).getMatrix());

    }
}