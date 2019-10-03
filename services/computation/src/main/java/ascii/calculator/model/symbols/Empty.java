package ascii.calculator.model.symbols;

import ascii.calculator.model.AbstractCoordinate;

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
