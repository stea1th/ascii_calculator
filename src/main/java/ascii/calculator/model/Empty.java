package ascii.calculator.model;

public class Empty extends AbstractCoordinate {

    public Empty() {
        setWidth(3);
    }

    @Override
    void setCoordinates() {
        // Do nothing because it's empty.
    }
}
