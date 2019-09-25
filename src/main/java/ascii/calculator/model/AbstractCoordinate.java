package ascii.calculator.model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCoordinate {

    private List<Pair<Integer, Integer>> properties = new ArrayList<>();
    private Integer width;

    public AbstractCoordinate() {
        setCoordinates();
    }

    void setCoordinates() {
    }

    void addCoordinates(int row, int column) {
        properties.add(new Pair<>(row, column));
    }

    public List<Pair<Integer, Integer>> getProperties() {
        return properties;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
