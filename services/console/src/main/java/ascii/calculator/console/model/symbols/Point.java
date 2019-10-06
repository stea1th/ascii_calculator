package ascii.calculator.console.model.symbols;

import ascii.calculator.console.model.AbstractCoordinate;

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
