package ascii.calculator.signs;

import ascii.calculator.model.*;

public class SignFabrik {

    public static SignInterface createSign(char character) {
        SignInterface signInterface;
        AbstractCoordinate coordinate;
        switch (character) {
            case '1':
                coordinate = new One();
                break;
            case '2':
                coordinate = new Two();
                break;
            case '3':
                coordinate = new Three();
                break;
            case '+':
                coordinate = new Plus();
                break;
            case '=':
                coordinate = new Equally();
                break;
            default:
                coordinate = new Empty();
                break;
        }
        signInterface = new Sign(coordinate.getWidth(), coordinate.getProperties());
        return signInterface;
    }
}
