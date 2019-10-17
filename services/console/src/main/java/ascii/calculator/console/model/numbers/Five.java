package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Five extends AbstractCoordinate {

    public Five() {
    }

    @Override
    public void register() {
        addToRegisteredClasses("5", "ascii.calculator.console.model.numbers.Five");
    }

    @Override
    public void load() {
        setCoordinates(new Three().getCoordinates());
        setCoordinates(1, createArray(0));
    }
}
