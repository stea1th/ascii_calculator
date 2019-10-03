package ascii.calculator.model.operators;

import ascii.calculator.model.AbstractCoordinate;

public class Divide extends AbstractCoordinate {

    public Divide() {
    }

    public Divide(int width) {
        super(width);
    }

    @Override
    public void load() {
        addCoordinates(0, createArray(4));
        addCoordinates(1, createArray(3));
        addCoordinates(2, createArray(2));
        addCoordinates(3, createArray(1));
        addCoordinates(4, createArray(0));
    }
}
