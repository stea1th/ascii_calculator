package ascii.calculator.signs;

import ascii.calculator.exception.CalculatorException;
import ascii.calculator.model.*;

import static ascii.calculator.enums.Operator.getOperator;

public class SignFabric {

    private SignFabric() {
        throw new CalculatorException("Utility Class");
    }

    public static SignInterface createSign(String character) {
        AbstractCoordinate coordinate;
        switch (getOperator(character)) {
            case ONE:
                coordinate = new One();
                break;
            case TWO:
                coordinate = new Two();
                break;
            case THREE:
                coordinate = new Three();
                break;
            case FOUR:
                coordinate = new Four();
                break;
            case FIVE:
                coordinate = new Five();
                break;
            case SIX:
                coordinate = new Six();
                break;
            case SEVEN:
                coordinate = new Seven();
                break;
            case EIGHT:
                coordinate = new Eight();
                break;
            case NINE:
                coordinate = new Nine();
                break;
            case ZERO:
                coordinate = new Zero();
                break;
            case PLUS:
                coordinate = new Plus();
                break;
            case EQUALLY:
                coordinate = new Equally();
                break;
            case MINUS:
                coordinate = new Minus();
                break;
            case MULTIPLY:
                coordinate = new Multiply();
                break;
            case COMMA:
            case POINT:
                coordinate = new Point(3);
                break;
            case DIVIDE:
                coordinate = new Divide();
                break;
            default:
                coordinate = new Empty(3);
                break;
        }
        return new Sign(coordinate);
    }
}
