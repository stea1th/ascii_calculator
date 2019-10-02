package ascii.calculator.model;

public class Point extends AbstractCoordinate {

    public Point() {
    }

    public Point(int width) {
        super(width);
    }

    @Override
    void load() {
        addCoordinates(4, createArray(1));
    }
}
