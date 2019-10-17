package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Seven extends AbstractCoordinate {

    public Seven() {
    }

    @Override
    public void register() {
        addToRegisteredClasses("7", "ascii.calculator.console.model.numbers.Seven");
    }

    @Override
    public void load() {
        setCoordinates(0, createArrayFromTo(0, 4));
        setCoordinates(1, createArray(4));
        setCoordinates(2, createArray(4));
        setCoordinates(3, createArray(4));
        setCoordinates(4, createArray(4));
    }
}
