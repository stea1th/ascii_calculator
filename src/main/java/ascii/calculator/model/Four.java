package ascii.calculator.model;

public class Four extends AbstractCoordinate {

    public Four(int width) {
        super(width);
    }

    public Four() {
        super();
    }

    @Override
    void load() {
        addCoordinates(0, createArray(0, 4));
        addCoordinates(1, createArray(0, 4));
        addCoordinates(3, createArray(4));
        addCoordinates(4, createArray(4));
        addCoordinates(2, createArrayFromTo(0, 4));
    }
}
