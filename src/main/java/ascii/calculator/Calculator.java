package ascii.calculator;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.SignHelper;
import ascii.calculator.helpers.StringHelper;

public class Calculator {

    public static void main(String[] args) {
//        String argument = args[0];
        String argument = "-1+2 - 3+ 2 -3 ";
        Integer computed = MathHelper.compute(StringHelper.cutStringToPairs(argument));
        argument += " = " + computed;
        SignHelper.printResult(SignHelper.transformToList(argument));
    }
}
