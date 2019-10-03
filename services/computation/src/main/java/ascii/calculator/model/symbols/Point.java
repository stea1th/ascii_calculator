package ascii.calculator.model.symbols;

import ascii.calculator.model.AbstractCoordinate;

public class Point extends AbstractCoordinate {

    public Point() {
    }

    public Point(int width) {
        super(width);
    }

    @Override
    public void load() {
        addCoordinates(4, createArray(1));
    }
}
