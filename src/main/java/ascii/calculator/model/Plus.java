package ascii.calculator.model;

public class Plus extends AbstractCoordinate {

    public Plus() {
        setWidth(6);
    }

    void setCoordinates() {
        addCoordinates(1, 2);
        addCoordinates(2, 0);
        addCoordinates(2, 1);
        addCoordinates(2, 2);
        addCoordinates(2, 3);
        addCoordinates(2, 4);
        addCoordinates(3, 2);
    }
}
