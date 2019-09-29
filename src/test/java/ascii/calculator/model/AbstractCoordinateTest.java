package ascii.calculator.model;

import ascii.calculator.exception.CalculatorException;
import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AbstractCoordinateTest{

    @Test
    void addCoordinates() {

    }

    @Test
    void removeCoordinate() {
    }

    @Test
    void createArrayFromToTest() {
        AbstractCoordinate abstractCoordinate = PowerMockito.mock(
                AbstractCoordinate.class);
//        assertTrue(abstractCoordinate == null);
        int[] arr = abstractCoordinate.createArrayFromTo(2, 4);
                assertTrue(arr == null);
//        Arrays.stream(arr).forEach(System.out::println);

//        assertThrows(CalculatorException.class, ()-> abstractCoordinate.createArrayFromTo(4,2));

//        Method create = PowerMockito.method(AbstractCoordinate.class, "createArrayFromTo", int.class);
//        assertThrows(CalculatorException.class, ()-> create.invoke(AbstractCoordinate.class, 4, 2));
    }
}