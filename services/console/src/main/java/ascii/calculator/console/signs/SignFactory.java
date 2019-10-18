package ascii.calculator.console.signs;

import ascii.calculator.console.model.AbstractCoordinate;
import ascii.calculator.exception.CalculatorException;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class SignFactory {

    private SignFactory() {
        throw new CalculatorException("Utility Class");
    }

    static {
        Reflections reflections = new Reflections(AbstractCoordinate.class);
        Set<Class<? extends AbstractCoordinate>> subTypes = reflections.getSubTypesOf(AbstractCoordinate.class);
        subTypes.forEach(i -> {
            try {
                i.getMethod("register").invoke(i.newInstance());
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
                e.printStackTrace();
            }
        });
    }

    public static SignInterface createSign(String character) {
        try {
            return new Sign(AbstractCoordinate.newInstance(character));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
