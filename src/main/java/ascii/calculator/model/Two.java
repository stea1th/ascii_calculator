package ascii.calculator.model;

public class Two extends AbstractCoordinate {

    public Two() {
        super();
    }

    public Two(int width) {
        super(width);
    }

    void load() {
        Three three = new Three();
        three.removeCoordinate(3);
        addCoordinates(three.getProperties());
        addCoordinates(3, createArray(0));
    }
}
