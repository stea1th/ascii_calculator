package ascii.calculator.console.model.symbols;

import ascii.calculator.console.model.AbstractCoordinate;

public class Empty extends AbstractCoordinate {

    public Empty() {
        super();
    }

    public Empty(int width) {
        super(width);
    }

    @Override
    public void load() {
        // Do nothing because it's empty.
    }
}
