package ascii.calculator.helpers;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHelperTest {

    @Test
    void cutStringToPairs() {
        String one = ".3";
        String two = "-4";
        String three = "/12";
        String four = "+-6.89";
        String testString = one + two + three + four;
        List<Pair<String, BigDecimal>> pairs = StringHelper.cutStringToPairs(testString);
        assertEquals(4, pairs.size());
        assertEquals("+", pairs.get(3).getKey());
        assertEquals("-6.89", pairs.get(3).getValue().toString());
        assertEquals("-", pairs.get(1).getKey());
        assertEquals("4.0", pairs.get(1).getValue().toString());
        assertEquals("+", pairs.get(0).getKey());
        assertEquals("0.3", pairs.get(0).getValue().toString());
    }

    @Test
    void onlyResultTest() {
        String result = StringHelper.onlyResult(new BigDecimal(0.333333));
        assertEquals("0,33", result);
    }

    @Test
    void formatResult(){
        String exp = "-2 + 14.5*-2";
        String expected = "-2 + 14.5*-2 = -31";
        assertEquals(expected, StringHelper.formatResult(exp, new BigDecimal(-31)));
    }

    @Test
    void formatResult2(){
        String expected = " = -21,33";
        assertEquals(expected, StringHelper.formatResult(new BigDecimal(-21.33333333)));

    }
}