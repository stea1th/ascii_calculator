package ascii.calculator.console.model.symbols;

import ascii.calculator.console.model.AbstractCoordinate;

public class Empty extends AbstractCoordinate {

    private final static int WIDTH = 3;

    public Empty() {
        super(WIDTH);
    }

    @Override
    public void register() {
        addToRegisteredClasses(" ", "ascii.calculator.console.model.symbols.Empty");
    }

    @Override
    public void load() {
        // Do nothing because it's empty.
    }
}
