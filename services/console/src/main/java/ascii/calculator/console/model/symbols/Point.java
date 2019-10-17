package ascii.calculator.console.model.symbols;

import ascii.calculator.console.model.AbstractCoordinate;

public class Point extends AbstractCoordinate {

    private final static int WIDTH = 3;

    public Point() {
        super(WIDTH);
    }

    @Override
    public void register() {
        addToRegisteredClasses(".", "ascii.calculator.console.model.symbols.Point");
        addToRegisteredClasses(",", "ascii.calculator.console.model.symbols.Point");
    }

    @Override
    public void load() {
        setCoordinates(4, createArray(1));
    }
}
