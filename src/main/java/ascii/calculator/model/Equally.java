package ascii.calculator.model;

public class Equally extends AbstractCoordinate {

    public Equally() {
        setWidth(6);
    }

    void load() {
        addCoordinates(1, createArrayFromTo(0, 3));
        addCoordinates(3, createArrayFromTo(0, 3));
    }
}
