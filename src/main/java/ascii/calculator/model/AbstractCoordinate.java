package ascii.calculator.model;

import ascii.calculator.exception.CalculatorException;
import javafx.util.Pair;

import java.util.*;
import java.util.stream.IntStream;

public abstract class AbstractCoordinate {

    private Map<Integer, int[]> properties = new HashMap<>();
    private Integer width;

    AbstractCoordinate() {
        setCoordinates();
    }

    abstract void setCoordinates();

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

    void setWidth(Integer width) {
        this.width = width;
    }

    int[] createArrayFromTo(int from, int to) {
        if(from > to) {
            try {
                throw new CalculatorException("From-value must be smaller than to-value");
            } catch (CalculatorException e) {
                System.err.println(e.getMessage());
                System.exit(-1);
            }
        }
        if(from < 0) {
            try {
                throw new CalculatorException("Coordinate value can't be smaller as 0");
            } catch (CalculatorException e) {
                System.err.println(e.getMessage());
                System.exit(-1);
            }
        }

        return IntStream.rangeClosed(from, to)
                .toArray();
    }

    int[] createArray(int... values){
        return values;
    }
}
