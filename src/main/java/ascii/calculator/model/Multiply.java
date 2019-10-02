package ascii.calculator.model;

public class Multiply extends AbstractCoordinate {

    public Multiply() {
        super();
    }

    public Multiply(int width) {
        super(width);
    }

    @Override
    void load() {
        addCoordinates(1, createArray(1, 3));
        addCoordinates(2, createArray(2));
        addCoordinates(3, createArray(1, 3));

    }
}
