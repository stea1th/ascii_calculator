package ascii.calculator.console.model.numbers;

import ascii.calculator.console.model.AbstractCoordinate;

public class Eight extends AbstractCoordinate {

    public Eight() {
    }

    @Override
    public void register() {
        addToRegisteredClasses("8", "ascii.calculator.console.model.numbers.Eight");
    }

    @Override
    public void load() {
        setCoordinates(new Three().getCoordinates());
        setCoordinates(1, createArray(0, 4));
        setCoordinates(3, createArray(0, 4));
    }
}
