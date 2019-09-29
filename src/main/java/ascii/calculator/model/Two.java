package ascii.calculator.model;

public class Two extends AbstractCoordinate {

    public Two() {
        setWidth(6);
    }

    void setCoordinates() {
        Three three = new Three();
        three.removeCoordinate(3);
        addCoordinates(three.getProperties());
        addCoordinates(3, createArray(0));
    }
}
