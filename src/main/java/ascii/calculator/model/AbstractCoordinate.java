package ascii.calculator.model;

import ascii.calculator.exception.CalculatorException;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public abstract class AbstractCoordinate {

    private Map<Integer, int[]> properties = new HashMap<>();
    private final Integer width;

    AbstractCoordinate() {
        this.width = 6;
        load();
    }

    public AbstractCoordinate(int width) {
        this.width = width;
        load();
    }

    abstract void load();

    void addCoordinates(int row, int[] columns){
        properties.put(row, columns);
    }

    void addCoordinates(Map<Integer, int[]> properties) {
        this.properties = properties;
    }

    void removeCoordinate(int row){
        properties.remove(row);
    }

    public Map<Integer, int[]> getProperties() {
        return properties;
    }

    public Integer getWidth() {
        return width;
    }

    int[] createArrayFromTo(int from, int to) {
        if(from > to) {
                throw new CalculatorException("From-value must be smaller than to-value");
        }
        if(from < 0) {
                throw new CalculatorException("Coordinate value can't be smaller as 0");
        }

        return IntStream.rangeClosed(from, to)
                .toArray();
    }

    int[] createArray(int... values){
        return values;
    }
}
