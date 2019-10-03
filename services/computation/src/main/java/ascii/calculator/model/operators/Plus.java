package ascii.calculator.model.operators;

import ascii.calculator.model.AbstractCoordinate;

public class Plus extends AbstractCoordinate {

    public Plus() {
        super();
    }

    public Plus(int width) {
        super(width);
    }

    public void load() {
        addCoordinates(1, createArray(2));
        addCoordinates(2, createArrayFromTo(0, 4));
        addCoordinates(3, createArray(2));
    }
}
