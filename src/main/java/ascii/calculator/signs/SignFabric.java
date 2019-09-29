package ascii.calculator.signs;

import ascii.calculator.model.*;

public class SignFabric {

    public static SignInterface createSign(char character) {
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
            case '-':
                coordinate = new Minus();
                break;
            default:
                coordinate = new Empty();
                break;
        }
        return new Sign(coordinate.getWidth(), coordinate.getProperties());
    }
}
