package ascii.calculator.model;

public class Zero extends AbstractCoordinate {

    public Zero() {
    }

    public Zero(int width) {
        super(width);
    }

    @Override
    void load() {
        addCoordinates(0, createArrayFromTo(0, 4));
        addCoordinates(4, createArrayFromTo(0, 4));
        addCoordinates(1, createArray(0, 4));
        addCoordinates(2, createArray(0, 4));
        addCoordinates(3, createArray(0, 4));
    }
}
