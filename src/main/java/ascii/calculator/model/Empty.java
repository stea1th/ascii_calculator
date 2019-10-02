package ascii.calculator.model;

public class Empty extends AbstractCoordinate {

    public Empty() {
        super();
    }

    public Empty(int width) {
        super(width);
    }

    @Override
    void load() {
        // Do nothing because it's empty.
    }
}
