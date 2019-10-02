package ascii.calculator.helpers;

import ascii.calculator.Calculator;
import ascii.calculator.exception.CalculatorException;
import javafx.util.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathHelperTest {

    @Test
    void compute() {
        List<Pair<String, BigDecimal>> expressions = new LinkedList<>();
        expressions.add(new Pair<>("+", new BigDecimal(11.2)));
        expressions.add(new Pair<>("+", new BigDecimal(3.7)));
        expressions.add(new Pair<>("*", new BigDecimal(4)));
        expressions.add(new Pair<>("-", new BigDecimal(12)));
        expressions.add(new Pair<>("/", new BigDecimal(3)));
        expressions.add(new Pair<>("/", new BigDecimal(2)));
        expressions.add(new Pair<>("-", new BigDecimal(0.5)));

        BigDecimal compute = MathHelper.compute(expressions);

        assertEquals("23.5", compute.stripTrailingZeros().toPlainString());
    }

    @Test
    void createMathHelperTest() throws Exception {
        Constructor<MathHelper> constructor = MathHelper.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        assertFalse(constructor.isAccessible());
        constructor.setAccessible(true);
//        constructor.newInstance();
//        assertThrows(CalculatorException.class, constructor.newInstance());
    }
}