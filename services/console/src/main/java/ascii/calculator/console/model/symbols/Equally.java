package ascii.calculator.console.model.symbols;

import ascii.calculator.console.model.AbstractCoordinate;

public class Equally extends AbstractCoordinate {

    public Equally() {
        super();
    }

    @Override
    public void register() {
        addToRegisteredClasses("=", "ascii.calculator.console.model.symbols.Equally");
    }

    public void load() {
        setCoordinates(1, createArrayFromTo(0, 3));
        setCoordinates(3, createArrayFromTo(0, 3));
    }
}
