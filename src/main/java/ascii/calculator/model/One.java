package ascii.calculator.model;

public class One extends AbstractCoordinate {

    public One() {
        super();
    }

    public One(int width) {
        super(width);
    }

    void load() {
        addCoordinates(0, createArray(4));
        addCoordinates(1, createArray(2, 4));
        addCoordinates(2, createArray(0, 4));
        addCoordinates(3, createArray(4));
        addCoordinates(4, createArray(4));
    }

}
