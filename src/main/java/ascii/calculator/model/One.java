package ascii.calculator.model;

public class One extends AbstractCoordinate {

    public One() {
        setWidth(6);
    }

    void load() {
        addCoordinates(0, createArray(4));
        addCoordinates(1, createArray(2, 4));
        addCoordinates(2, createArray(0, 4));
        addCoordinates(3, createArray(4));
        addCoordinates(4, createArray(4));
    }

}
