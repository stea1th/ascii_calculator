package ascii.calculator;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.SignHelper;
import ascii.calculator.helpers.StringHelper;

public class Calculator {

    public static void main(String[] args) {
//        compute(args[0]);
        compute("-1+2 - 3+ 2 -3 ");


    }

    private static void compute(String argument){
        Integer computed = MathHelper.compute(StringHelper.cutStringToPairs(argument));
        argument += " = " + computed;
        SignHelper.printResult(SignHelper.transformToList(argument));
    }
}
