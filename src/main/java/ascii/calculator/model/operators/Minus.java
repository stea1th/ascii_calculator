package ascii.calculator.model.operators;

import ascii.calculator.model.AbstractCoordinate;

public class Minus extends AbstractCoordinate {

    public Minus() {
        super();
    }

    public Minus(int width) {
        super(width);
    }

    @Override
    public void load() {
        addCoordinates(2, createArrayFromTo(0, 4));
    }
}
