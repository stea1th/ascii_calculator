package ascii.calculator.model;

public class Three extends AbstractCoordinate {

    public Three() {
        setWidth(6);
    }

    void load() {
        addCoordinates(0, createArrayFromTo(0, 4));
        addCoordinates(2, createArrayFromTo(0, 4));
        addCoordinates(4, createArrayFromTo(0, 4));
        addCoordinates(1, createArray(4));
        addCoordinates(3, createArray(4));
    }
}
