package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Nine extends AbstractCoordinate {

    public Nine() {
    }

    @Override
    public void register() {
        addToRegisteredClasses("9", "ascii.calculator.console.model.numbers.Nine");
    }

    @Override
    public void load() {
        setCoordinates(new Three().getCoordinates());
        setCoordinates(1, createArray(0, 4));

    }
}
