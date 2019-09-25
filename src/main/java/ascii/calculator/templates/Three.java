package ascii.calculator.templates;

public class Three extends AbstractSign{
    public Three() {
        setWidth(6);
        createEmptyMatrix();
        setCoordinates();
        create();
    }

    @Override
    void setCoordinates() {
        addCoordinates(0, 0);
        addCoordinates(0, 1);
        addCoordinates(0, 2);
        addCoordinates(0, 3);
        addCoordinates(0, 4);
        addCoordinates(1, 4);
        addCoordinates(2, 0);
        addCoordinates(2, 1);
        addCoordinates(2, 2);
        addCoordinates(2, 3);
        addCoordinates(2, 4);
        addCoordinates(3, 4);
        addCoordinates(4, 0);
        addCoordinates(4, 1);
        addCoordinates(4, 2);
        addCoordinates(4, 3);
        addCoordinates(4, 4);
    }
}
