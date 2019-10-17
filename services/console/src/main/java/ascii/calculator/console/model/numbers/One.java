package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class One extends AbstractCoordinate {

    public One() {
        super();
    }

    @Override
    public void register() {
        addToRegisteredClasses("1", "ascii.calculator.console.model.numbers.One");
    }


    public void load() {
        setCoordinates(0, createArray(4));
        setCoordinates(1, createArray(2, 4));
        setCoordinates(2, createArray(0, 4));
        setCoordinates(3, createArray(4));
        setCoordinates(4, createArray(4));
    }

}
