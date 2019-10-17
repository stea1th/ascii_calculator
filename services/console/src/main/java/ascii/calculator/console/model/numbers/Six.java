package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Six extends AbstractCoordinate {

    public Six() {
    }

    @Override
    public void register() {
        addToRegisteredClasses("6", "ascii.calculator.console.model.numbers.Six");
    }

    @Override
    public void load() {
        setCoordinates( new Three().getCoordinates());
        setCoordinates(1, createArray(0));
        setCoordinates(3, createArray(0, 4));
    }
}
