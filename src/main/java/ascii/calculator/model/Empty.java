package ascii.calculator.model;

public class Empty extends AbstractCoordinate {

    public Empty() {
        setWidth(3);
    }

    @Override
    void load() {
        // Do nothing because it's empty.
    }
}
