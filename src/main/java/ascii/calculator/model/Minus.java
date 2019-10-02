package ascii.calculator.model;

public class Minus extends AbstractCoordinate {

    public Minus() {
        super();
    }

    public Minus(int width) {
        super(width);
    }

    @Override
    void load() {
        addCoordinates(2, createArrayFromTo(0, 4));
    }
}
