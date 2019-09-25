package ascii.calculator.templates;

import java.util.Arrays;

abstract class AbstractSign implements Interf {

    public static final Integer HEIGHT = 5;
    public static final Integer WIDTH = 6;

    String[][] matrix;

    AbstractSign() {
        init();
    }

    public void init() {
        matrix = new String[HEIGHT][WIDTH];
        for (String[] strings : matrix) {
            Arrays.fill(strings, " ");
        }
    }

    public String[][] getMatrix() {
        return matrix;
    }

    //    public StringBuilder draw(String[][] matrix) {
//        StringBuilder stringBuilder = new StringBuilder();
////        for (String[] strings : matrix) {
////            for(String string : strings) {
//////                System.out.print(string);
////                stringBuilder.append(string);
////            }
//////            System.out.println();
////            stringBuilder.append("\n");
////        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                stringBuilder.append(matrix[i][j]);
//            }
//            if (i < matrix.length - 1) {
//                stringBuilder.append("\n");
//            }
//        }
//        return stringBuilder;
//    }
}
