package ascii.calculator.model;

public class One extends AbstractCoordinate {

    public One() {
        setWidth(6);
    }

    void setCoordinates() {
        addCoordinates(0, 4);
        addCoordinates(1, 2);
        addCoordinates(2, 0);
        addCoordinates(2, 4);
        addCoordinates(3, 4);
        addCoordinates(4, 4);
        addCoordinates(1, 4);
    }

}
