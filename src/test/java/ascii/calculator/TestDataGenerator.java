package ascii.calculator;

import ascii.calculator.signs.Sign;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestDataGenerator {

    public static Sign generateSign() {
        return generateSign(3);
    }

    public static Sign generateSign(int width) {
        return new Sign(width, generateProperties());
    }

    private static Map<Integer, int[]> generateProperties() {
        Map<Integer, int[]> props = new HashMap<>();
        props.put(0, new int[]{0, 1, 2});
        props.put(1, new int[]{0, 2});
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

//    private String[][] createEmptyMatrix(){
//        return createEmptyMatrix(5, 6);
//    }
//
//    private String[][] createEmptyMatrix(int height, int width ){
//        String[][]matrix = new String[height][width];
//        for (String[] strings : matrix) {
//            Arrays.fill(strings, " ");
//        }
//        return matrix;
//    }
}