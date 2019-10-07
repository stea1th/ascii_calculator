package ascii.calculator.helpers;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHelperTest {

    @Test
    void cutStringToPairs() {
        String one = "-3";
        String two = "+4";
        String three = "/12";
        String four = "+-6.89";
        String testString = one + two + three + four;
        List<Pair<String, BigDecimal>> pairs = StringHelper.cutStringToPairs(testString);
        assertEquals(4, pairs.size());
        assertEquals("+", pairs.get(3).getKey());
        assertEquals("-6.89", pairs.get(3).getValue().toString());
        assertEquals("-", pairs.get(0).getKey());
        assertEquals("3.0", pairs.get(0).getValue().toString());
    }
}