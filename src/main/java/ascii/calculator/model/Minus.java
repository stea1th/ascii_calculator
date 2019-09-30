package ascii.calculator.model;

public class Minus extends AbstractCoordinate {

    public Minus() {
        setWidth(6);
    }

    @Override
    void load() {
        addCoordinates(2, createArrayFromTo(0, 4));
    }
}
