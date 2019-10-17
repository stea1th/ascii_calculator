package ascii.calculator.console.signs;

import ascii.calculator.console.model.AbstractCoordinate;
import ascii.calculator.exception.CalculatorException;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class SignFactory {

    private SignFactory() {
        throw new CalculatorException("Utility Class");
    }

    static {
        Set<Class<? extends AbstractCoordinate>> subTypes = new Reflections().getSubTypesOf(AbstractCoordinate.class);
        subTypes.forEach(i -> {
            try {
                i.getMethod("register").invoke(i.newInstance());
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
                e.printStackTrace();
            }
        });
    }

    public static SignInterface createSign(String character) {
        try {
            return new Sign(AbstractCoordinate.newInstance(character));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static SignInterface createSign(String character) {
//        AbstractCoordinate coordinate;
//        switch (getOperator(character)) {
//            case ONE:
//                coordinate = new One();
//                break;
//            case TWO:
//                coordinate = new Two();
//                break;
//            case THREE:
//                coordinate = new Three();
//                break;
//            case FOUR:
//                coordinate = new Four();
//                break;
//            case FIVE:
//                coordinate = new Five();
//                break;
//            case SIX:
//                coordinate = new Six();
//                break;
//            case SEVEN:
//                coordinate = new Seven();
//                break;
//            case EIGHT:
//                coordinate = new Eight();
//                break;
//            case NINE:
//                coordinate = new Nine();
//                break;
//            case ZERO:
//                coordinate = new Zero();
//                break;
//            case PLUS:
//                coordinate = new Plus();
//                break;
//            case EQUALLY:
//                coordinate = new Equally();
//                break;
//            case MINUS:
//                coordinate = new Minus();
//                break;
//            case MULTIPLY:
//                coordinate = new Multiply();
//                break;
//            case COMMA:
//            case POINT:
//                coordinate = new Point(3);
//                break;
//            case DIVIDE:
//                coordinate = new Divide();
//                break;
//            case EMPTY:
//            default:
//                coordinate = new Empty(3);
//                break;
//        }
//        return new Sign(coordinate);
//    }
}
