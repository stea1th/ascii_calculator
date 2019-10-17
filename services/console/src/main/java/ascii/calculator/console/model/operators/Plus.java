package ascii.calculator.console.model.operators;

import ascii.calculator.console.model.AbstractCoordinate;

public class Plus extends AbstractCoordinate {

    public Plus() {
        super();
    }

    @Override
    public void register() {
        addToRegisteredClasses("+", "ascii.calculator.console.model.operators.Plus");
    }

    public void load() {
        setCoordinates(1, createArray(2));
        setCoordinates(2, createArrayFromTo(0, 4));
        setCoordinates(3, createArray(2));
    }
}
