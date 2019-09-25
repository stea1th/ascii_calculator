package ascii.calculator.model;

public class Minus extends AbstractCoordinate {

    public Minus() {
        setWidth(6);
    }

    @Override
    void setCoordinates() {
        addCoordinates(2, 1);
        addCoordinates(2, 2);
        addCoordinates(2, 3);
        addCoordinates(2, 4);
        addCoordinates(2, 0);
    }
}
