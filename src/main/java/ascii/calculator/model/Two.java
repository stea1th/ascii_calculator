package ascii.calculator.model;

public class Two extends AbstractCoordinate {

    public Two() {
        super();
    }

    public Two(int width) {
        super(width);
    }

    void load() {
        addCoordinates(new Three().getProperties());
        addCoordinates(3, createArray(0));
    }
}
