package ascii.calculator;

import ascii.calculator.templates.Helper;
import ascii.calculator.templates.Interf;
import ascii.calculator.templates.One;
import ascii.calculator.templates.Two;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {

        List<Interf> result = new ArrayList<>();
        Interf number = new One();
        Interf number2 = new Two();
        number.createNumber();
        number2.createNumber();
        result.add(number);
        result.add(number2);
        Helper.printResult(result);

//        System.out.print(number.draw(number.createNumber()).toString() + number2.draw(number2.createNumber()).toString());

    }
}
