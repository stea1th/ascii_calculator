package ascii.calculator.model.numbers;

import ascii.calculator.model.AbstractCoordinate;

public class Nine extends AbstractCoordinate {

    public Nine() {
    }

    public Nine(int width) {
        super(width);
    }

    @Override
    public void load() {
        addCoordinates(new Three().getProperties());
        addCoordinates(1, createArray(0, 4));

    }
}
