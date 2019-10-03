package ascii.calculator.model.numbers;

import ascii.calculator.model.AbstractCoordinate;

public class Five extends AbstractCoordinate {

    public Five() {
    }

    public Five(int width) {
        super(width);
    }

    @Override
    public void load() {
        addCoordinates(new Three().getProperties());
        addCoordinates(1, createArray(0));
    }
}
