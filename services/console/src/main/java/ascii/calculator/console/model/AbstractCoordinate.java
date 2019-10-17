package ascii.calculator.console.model;

import ascii.calculator.exception.CalculatorException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public abstract class AbstractCoordinate {

    @Getter
    @Setter(value = AccessLevel.PROTECTED)
    private Map<Integer, int[]> coordinates = new HashMap<>();
    @Getter
    private Integer width;
    private final static Map<String, String> REGISTERED_CLASSES = new HashMap<>();

    public AbstractCoordinate() {
        this(6);
    }

    public AbstractCoordinate(int width) {
        this.width = width;
        load();
    }

    protected abstract void register();

    protected abstract void load();

    public static <T extends AbstractCoordinate> T newInstance(String key) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String clazzName = REGISTERED_CLASSES.get(key);
        return (T) Class.forName(clazzName != null ? clazzName : REGISTERED_CLASSES.get(" ")).newInstance();
    }

    public void addToRegisteredClasses(String key, String value) {
        REGISTERED_CLASSES.put(key, value);
    }

    protected void setCoordinates(int row, int[] columns) {
        coordinates.put(row, columns);
    }

    protected int[] createArrayFromTo(int from, int to) {
        if (from > to) {
            throw new CalculatorException("From-value must be smaller than to-value");
        }
        if (from < 0) {
            throw new CalculatorException("Coordinate value can't be smaller as 0");
        }

        return IntStream.rangeClosed(from, to)
                .toArray();
    }

    protected int[] createArray(int... values) {
        return values;
    }
}
