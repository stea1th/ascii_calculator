package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Two extends AbstractCoordinate {

    public Two() {
        super();
    }

    public Two(int width) {
        super(width);
    }

    public void load() {
        addCoordinates(new Three().getProperties());
        addCoordinates(3, createArray(0));
    }
}
