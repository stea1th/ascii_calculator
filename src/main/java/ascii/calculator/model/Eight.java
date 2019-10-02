package ascii.calculator.model;

public class Eight extends AbstractCoordinate {

    public Eight() {
    }

    public Eight(int width) {
        super(width);
    }

    @Override
    void load() {
        addCoordinates(new Three().getProperties());
        addCoordinates(1, createArray(0, 4));
        addCoordinates(3, createArray(0, 4));
    }
}
