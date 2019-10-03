package ascii.calculator.console.model.symbols;

import ascii.calculator.console.model.AbstractCoordinate;

public class Equally extends AbstractCoordinate {

    public Equally() {
        super();
    }

    public Equally(int width) {
        super(width);
    }

    public void load() {
        addCoordinates(1, createArrayFromTo(0, 3));
        addCoordinates(3, createArrayFromTo(0, 3));
    }
}
