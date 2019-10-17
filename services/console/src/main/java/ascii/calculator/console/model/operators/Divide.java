package ascii.calculator.console.model.operators;

import ascii.calculator.console.model.AbstractCoordinate;

public class Divide extends AbstractCoordinate {

    public Divide() {
    }

    @Override
    public void register() {
        addToRegisteredClasses("/", "ascii.calculator.console.model.operators.Divide");
    }

    @Override
    public void load() {
        setCoordinates(0, createArray(4));
        setCoordinates(1, createArray(3));
        setCoordinates(2, createArray(2));
        setCoordinates(3, createArray(1));
        setCoordinates(4, createArray(0));
    }
}
