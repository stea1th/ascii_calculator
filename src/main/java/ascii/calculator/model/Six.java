package ascii.calculator.model;

public class Six extends AbstractCoordinate {

    public Six() {
    }

    public Six(int width) {
        super(width);
    }

    @Override
    void load() {
        addCoordinates( new Three().getProperties());
        addCoordinates(1, createArray(0));
        addCoordinates(3, createArray(0, 4));
    }
}
