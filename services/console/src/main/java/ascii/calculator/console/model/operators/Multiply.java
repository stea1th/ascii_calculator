package ascii.calculator.console.model.operators;

import ascii.calculator.console.model.AbstractCoordinate;

public class Multiply extends AbstractCoordinate {

    public Multiply() {
        super();
    }

    @Override
    public void register() {
        addToRegisteredClasses("*", "ascii.calculator.console.model.operators.Multiply");
    }

    @Override
    public void load() {
        setCoordinates(1, createArray(1, 3));
        setCoordinates(2, createArray(2));
        setCoordinates(3, createArray(1, 3));

    }
}
