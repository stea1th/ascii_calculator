package ascii.calculator.templates;

public class Equally  extends AbstractSign{

    public Equally() {
        setWidth(6);
        createEmptyMatrix();
        setCoordinates();
        create();
    }

    @Override
    void setCoordinates() {
        addCoordinates(1,0);
        addCoordinates(1,1);
        addCoordinates(1,2);
        addCoordinates(1,3);
        addCoordinates(1,4);
        addCoordinates(3,0);
        addCoordinates(3,1);
        addCoordinates(3,2);
        addCoordinates(3,3);
        addCoordinates(3,4);
    }
}
