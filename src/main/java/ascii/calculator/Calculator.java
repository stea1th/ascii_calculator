package ascii.calculator;

import ascii.calculator.templates.SignHelper;

public class Calculator {

    public static void main(String[] args) {

        String x = "21+1222=3";
        SignHelper.printResult(SignHelper.transformToList(x));

    }
}
