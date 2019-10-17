package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Three extends AbstractCoordinate {

    public Three() {
        super();
    }

    @Override
    public void register() {
        addToRegisteredClasses("3", "ascii.calculator.console.model.numbers.Three");
    }

    public void load() {
        setCoordinates(0, createArrayFromTo(0, 4));
        setCoordinates(2, createArrayFromTo(0, 4));
        setCoordinates(4, createArrayFromTo(0, 4));
        setCoordinates(1, createArray(4));
        setCoordinates(3, createArray(4));
    }
}
