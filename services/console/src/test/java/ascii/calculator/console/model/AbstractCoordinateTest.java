package ascii.calculator.console.model;

import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

class AbstractCoordinateTest {

    @Test
    void test() throws Exception {
        Set<Class<? extends AbstractCoordinate>> subTypes = new Reflections().getSubTypesOf(AbstractCoordinate.class);
        subTypes.forEach(i -> {
            try {
                i.getMethod("register").invoke(i.newInstance());
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
                e.printStackTrace();
            }
        });
//        System.out.println(AbstractCoordinate.REGISTERED_CLASSES.size());
    }

}