package ascii.calculator.console;

import ascii.calculator.console.signs.Sign;

import java.util.HashMap;
import java.util.Map;

public class TestDataGenerator {

    public static Sign generateSign() {
        return generateSign(3);
    }

    public static Sign generateSign(int width) {
        return generateSign(width, generateProperties());
    }

    public static Sign generateSign(int width, Map<Integer, int[]> props){
        return new Sign(width, props);
    }

    private static Map<Integer, int[]> generateProperties() {
        Map<Integer, int[]> props = new HashMap<>();
        props.put(0, new int[]{0, 1, 2});
        props.put(1, new int[]{0, 2});
        return props;
    }

    public static Map<Integer, int[]> generatePlusProperties() {
        Map<Integer, int[]> props = new HashMap<>();
        props.put(1, new int[]{2});
        props.put(2, new int[]{0, 1, 2, 3, 4});
        props.put(3, new int[]{2});
        return props;
    }

    public static String[][] createEmptyMatrix(){
        return new String[][] {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
        };
    }
}
