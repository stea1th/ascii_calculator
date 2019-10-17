package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Zero extends AbstractCoordinate {

    public Zero() {
    }

    @Override
    public void register() {
        addToRegisteredClasses("0", "ascii.calculator.console.model.numbers.Zero");
    }

    @Override
    public void load() {
        setCoordinates(0, createArrayFromTo(0, 4));
        setCoordinates(4, createArrayFromTo(0, 4));
        setCoordinates(1, createArray(0, 4));
        setCoordinates(2, createArray(0, 4));
        setCoordinates(3, createArray(0, 4));
    }
}
