package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Two extends AbstractCoordinate {

    public Two() {
        super();
    }

    @Override
    public void register() {
        addToRegisteredClasses("2", "ascii.calculator.console.model.numbers.Two");
    }

    public void load() {
        setCoordinates(new Three().getCoordinates());
        setCoordinates(3, createArray(0));
    }
}
