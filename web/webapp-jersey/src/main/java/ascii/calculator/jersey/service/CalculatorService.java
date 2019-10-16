package ascii.calculator.jersey.service;

import ascii.calculator.console.helpers.SignHelper;
import ascii.calculator.helpers.StringHelper;
import javafx.util.Pair;
import org.springframework.stereotype.Service;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

@Service
public class CalculatorService {

    private Deque<Pair<String, String>> DEQUE;
    private static String LASTKEY, LASTVALUE, PAIRKEY, PAIRVALUE;
    private final static int DISPLAY_LENGTH = 14;
    private final static String ZERO = "0";
    private final static String NUMBER = "Number";
    private final static String ACTION = "Action";
    private final static String COMMA = ",";
    private final static String PLUS_MINUS = "M";
    private final static String MINUS = "-";
    private final static String DELETE_ALL = "C";
    private final static String DELETE_LAST = "CE";
    private final static String DELETE_LAST_SIGN = "D";
    private final static String ACTIONS = "[-+*/P]";
    private final static String PLUS_SIGN = "P";
    private final static String PLUS = "+";
    private final static String RESULT = "R";


    public CalculatorService() {
        DEQUE = new LinkedList<>();
        DEQUE.addLast(createPair(NUMBER, ZERO));
    }

    private void init() {
        Pair<String, String> last = DEQUE.getLast();
        LASTKEY = last.getKey();
        LASTVALUE = last.getValue();
    }

    private void init(Pair<String, String> pair) {
        init();
        PAIRKEY = pair.getKey();
        PAIRVALUE = pair.getValue();
    }

    public String[] getMatrix(String num) {
        String res = createStringFromDeque();
        switch (num) {
            case COMMA:
                if (res.length() < DISPLAY_LENGTH)
                    editComma(createPair(NUMBER, num));
                break;
            case PLUS_MINUS:
                if (res.length() < DISPLAY_LENGTH)
                    editNegation(createPair(NUMBER, MINUS));
                break;
            case DELETE_ALL:
                deleteAll();
                break;
            case DELETE_LAST:
                deleteLast();
                break;
            case DELETE_LAST_SIGN:
                deleteLastSign();
                break;
            case RESULT:
                getResult();
                break;
            default:
                if (res.length() < DISPLAY_LENGTH)
                    formString(createPair(ACTIONS.contains(num) ? ACTION : NUMBER, num.equals(PLUS_SIGN) ? PLUS : num));
                break;
        }
        return createMatrix();
    }



    private void getResult() {
        String result = createStringFromDeque();
        result = StringHelper.onlyResult(result);
        deleteAll();
        removeAndAddLastPair(createPair(NUMBER, result));
    }

    private void formString(Pair<String, String> pair) {
        init(pair);
        if (LASTKEY.equals(PAIRKEY) && PAIRKEY.equals(NUMBER)) {
            removeAndAddLastPair(createPair(LASTKEY, !LASTVALUE.equals(ZERO) ?
                    LASTVALUE + PAIRVALUE : PAIRVALUE));
        } else if (!LASTKEY.equals(PAIRKEY)) {
            if (LASTVALUE.endsWith(COMMA)) {
                removeAndAddLastPair(createPair(LASTKEY, removeLastChar(LASTVALUE)));
            }
            DEQUE.addLast(pair);
        }
    }

    private void deleteAll() {
        DEQUE.clear();
        DEQUE.addLast(createPair(NUMBER, ZERO));
    }

    private void deleteLast() {
        DEQUE.pollLast();
        if (DEQUE.size() == 0) {
            DEQUE.addLast(createPair(NUMBER, ZERO));
        }
    }

    private void deleteLastSign() {
        init();
        LASTVALUE = removeLastChar(LASTVALUE);
        if (LASTVALUE.length() == 0) {
            deleteLast();
        } else {
            removeAndAddLastPair(createPair(LASTKEY, LASTVALUE.endsWith(COMMA) ? removeLastChar(LASTVALUE) : LASTVALUE));
        }
    }

    private void editComma(Pair<String, String> pair) {
        init(pair);
        if (LASTKEY.equals(PAIRKEY)) {
            if (!LASTVALUE.contains(COMMA)) {
                if (LASTVALUE.startsWith(MINUS) && DEQUE.size() == 1) {
                    removeAndAddLastPair(createPair(LASTKEY, LASTVALUE + ZERO + PAIRVALUE));
                } else {
                    removeAndAddLastPair(createPair(LASTKEY, LASTVALUE + PAIRVALUE));
                }
            }
        } else {
            DEQUE.addLast(createPair(PAIRKEY, ZERO + PAIRVALUE));
        }
    }

    private void editNegation(Pair<String, String> pair) {
        init(pair);
        if (LASTKEY.equals(PAIRKEY)) {
            removeAndAddLastPair(createPair(LASTKEY,
                    LASTVALUE.startsWith(MINUS) ? LASTVALUE.substring(1) :
                            LASTVALUE.equals(ZERO) ? PAIRVALUE + LASTVALUE.substring(1) :
                                    PAIRVALUE + LASTVALUE));
        } else {
            DEQUE.addLast(pair);
        }
    }

    private String createStringFromDeque() {
        return DEQUE.stream().map(Pair::getValue)
                .collect(Collectors.joining());
    }

    private String[] createMatrix() {
        return SignHelper.transformStringToArray(createStringFromDeque());
    }

    private static Pair<String, String> createPair(String key, String value) {
        return new Pair<>(key, value);
    }

    private void removeAndAddLastPair(Pair<String, String> pair) {
        DEQUE.removeLast();
        DEQUE.addLast(pair);
    }

    private String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }


}
