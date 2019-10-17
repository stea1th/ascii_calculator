package ascii.calculator.console.model.operators;

import ascii.calculator.console.model.AbstractCoordinate;

public class Minus extends AbstractCoordinate {

    public Minus() {
        super();
    }

    @Override
    public void register() {
        addToRegisteredClasses("-", "ascii.calculator.console.model.operators.Minus");
    }

    @Override
    public void load() {
        setCoordinates(2, createArrayFromTo(0, 4));
    }
}
