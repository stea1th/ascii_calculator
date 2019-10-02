package ascii.calculator;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.SignHelper;
import ascii.calculator.helpers.StringHelper;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Calculator {

    public static void main(String[] args) {
        compute(args[0]);
    }

    private static void compute(String argument){
        BigDecimal computed = MathHelper.compute(StringHelper.cutStringToPairs(argument));
        DecimalFormat format = new DecimalFormat("0.##");
        argument += " = " + format.format(computed.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        SignHelper.printResult(SignHelper.transformToList(argument));
    }
}
