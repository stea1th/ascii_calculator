package ascii.calculator;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;
import ascii.calculator.helpers.SignHelper;

import java.math.BigDecimal;

public class Calculator {

    public static void main(String[] args) {
        compute(args[0]);
    }

    private static void compute(String argument){
        BigDecimal computed = MathHelper.compute(StringHelper.cutStringToPairs(argument));
        String result = StringHelper.formatResult(argument, computed);
        SignHelper.printResult(SignHelper.transformToList(result));
    }
}
