package ascii.calculator.model;

public class Nine extends AbstractCoordinate {

    public Nine() {
    }

    public Nine(int width) {
        super(width);
    }

    @Override
    void load() {
        addCoordinates(new Three().getProperties());
        addCoordinates(1, createArray(0, 4));

    }
}
