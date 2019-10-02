package ascii.calculator.model;

public class Equally extends AbstractCoordinate {

    public Equally() {
        super();
    }

    public Equally(int width) {
        super(width);
    }

    void load() {
        addCoordinates(1, createArrayFromTo(0, 3));
        addCoordinates(3, createArrayFromTo(0, 3));
    }
}
