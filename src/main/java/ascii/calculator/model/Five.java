package ascii.calculator.model;

public class Five extends AbstractCoordinate {

    public Five() {
    }

    public Five(int width) {
        super(width);
    }

    @Override
    void load() {
        addCoordinates(new Three().getProperties());
        addCoordinates(1, createArray(0));
    }
}
