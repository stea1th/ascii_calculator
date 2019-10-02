package ascii.calculator.model.numbers;

import ascii.calculator.model.AbstractCoordinate;

public class Seven extends AbstractCoordinate {

    public Seven() {
    }

    public Seven(int width) {
        super(width);
    }

    @Override
    public void load() {
        addCoordinates(0, createArrayFromTo(0, 4));
        addCoordinates(1, createArray(4));
        addCoordinates(2, createArray(4));
        addCoordinates(3, createArray(4));
        addCoordinates(4, createArray(4));
    }
}
