package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Four extends AbstractCoordinate {

    @Override
    public void register() {
        addToRegisteredClasses("4", "ascii.calculator.console.model.numbers.Four");
    }

    public Four() {
        super();
    }

    @Override
    public void load() {
        setCoordinates(0, createArray(0, 4));
        setCoordinates(1, createArray(0, 4));
        setCoordinates(3, createArray(4));
        setCoordinates(4, createArray(4));
        setCoordinates(2, createArrayFromTo(0, 4));
    }
}
