package ascii.calculator.jersey.service;

import ascii.calculator.console.helpers.SignHelper;
import javafx.util.Pair;
import org.springframework.stereotype.Service;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

@Service
public class CalculatorService {

    private Deque<Pair<String, String>> deque;
    private static String LASTKEY, LASTVALUE, PAIRKEY, PAIRVALUE;
    public final static String ZERO = "0";
    public final static String NUMBER = "Number";
    public final static String ACTION = "Action";
    public final static String COMMA = ",";
    public final static String MINUS = "-";
    public final static String DELETE_ALL = "C";
    public final static String DELETE_LAST = "CE";

    public CalculatorService() {
        deque = new LinkedList<>();
        deque.addLast(new Pair<>(NUMBER, ZERO));
    }

    private void init(Pair<String, String> pair) {
        Pair<String, String> last = deque.getLast();
        LASTKEY = last.getKey();
        LASTVALUE = last.getValue();
        PAIRKEY = pair.getKey();
        PAIRVALUE = pair.getValue();
    }

    public String[] formString(Pair<String, String> pair) {
        init(pair);
        if (LASTKEY.equals(PAIRKEY) && PAIRKEY.equals(NUMBER)) {
            removeAndAddLastPair(new Pair<>(LASTKEY, !LASTVALUE.equals(ZERO) ?
                    LASTVALUE + PAIRVALUE : PAIRVALUE));
        } else if (!LASTKEY.equals(PAIRKEY)) {
            if (LASTVALUE.endsWith(COMMA)) {
                removeAndAddLastPair(new Pair<>(LASTKEY, LASTVALUE.substring(0, LASTVALUE.length() - 1)));
            }
            deque.addLast(pair);
        }
        return createMatrix();
    }

    public String[] deleteAll() {
        deque.clear();
        deque.addLast(new Pair<>(NUMBER, ZERO));
        return createMatrix();
    }

    public String[] deleteLast() {
        deque.pollLast();
        return createMatrix();
    }

    public String[] editComma(Pair<String, String> pair) {
        init(pair);
        if (LASTKEY.equals(PAIRKEY)) {
            if (!LASTVALUE.contains(COMMA)) {
                if (LASTVALUE.startsWith(MINUS) && deque.size() == 1) {
                    removeAndAddLastPair(new Pair<>(LASTKEY, LASTVALUE + ZERO + PAIRVALUE));
                } else {
                    removeAndAddLastPair(new Pair<>(LASTKEY, LASTVALUE + PAIRVALUE));
                }
            }
        } else {
            deque.addLast(new Pair<>(PAIRKEY, ZERO + PAIRVALUE));
        }
        return createMatrix();
    }

    public String[] editNegation(Pair<String, String> pair) {
        init(pair);
        if (LASTKEY.equals(PAIRKEY)) {
            removeAndAddLastPair(new Pair<>(LASTKEY,
                    LASTVALUE.startsWith(MINUS) ? LASTVALUE.substring(1) :
                            LASTVALUE.equals(ZERO) ? PAIRVALUE + LASTVALUE.substring(1) :
                                    PAIRVALUE + LASTVALUE));
        } else {
            deque.addLast(pair);
        }
        return createMatrix();
    }

    private String createStringFromDeque() {
        return deque.stream().map(Pair::getValue)
                .collect(Collectors.joining());
    }

    private String[] createMatrix() {
        return SignHelper.transformStringToArray(createStringFromDeque());
    }

    private void removeAndAddLastPair(Pair<String, String> pair) {
        deque.removeLast();
        deque.addLast(pair);
    }


}
