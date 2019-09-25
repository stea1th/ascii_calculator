package ascii.calculator.templates;

public class SignFabrik {

    public static SignInterface createSign(char character) {
        switch (character) {
            case '1':
                return new One();
            case '2':
                return new Two();
            case '3':
                return new Three();
            case '+':
                return new Plus();
            case '=':
                return new Equally();
            default:
                return null;
        }
    }
}
