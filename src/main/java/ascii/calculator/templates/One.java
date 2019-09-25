package ascii.calculator.templates;

public class One extends AbstractSign {

    public One() {
        setWidth(6);
        createEmptyMatrix();
        setCoordinates();
        create();
    }

    @Override
    void setCoordinates() {
        addCoordinates(0, 4);
        addCoordinates(1, 2);
        addCoordinates(2, 0);
        addCoordinates(2, 4);
        addCoordinates(3, 4);
        addCoordinates(4, 4);
        addCoordinates(1, 4);
    }
}
