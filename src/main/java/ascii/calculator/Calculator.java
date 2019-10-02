package ascii.calculator;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;

import java.math.BigDecimal;

import static ascii.calculator.helpers.SignHelper.printResult;
import static ascii.calculator.helpers.SignHelper.transformToList;
import static ascii.calculator.helpers.StringHelper.formatResult;

public class Calculator {

    public static void main(String[] args) {
        compute(args[0]);
    }

    private static void compute(String argument){
        BigDecimal computed = MathHelper.compute(StringHelper.cutStringToPairs(argument));
        String result = formatResult(argument, computed);
        printResult(transformToList(result));
    }
}
