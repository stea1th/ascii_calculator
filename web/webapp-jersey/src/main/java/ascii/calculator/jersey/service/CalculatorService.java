package ascii.calculator.jersey.service;

import javafx.util.Pair;
import org.springframework.stereotype.Service;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

@Service
public class CalculatorService {

    private Deque<Pair<String, String>> deque;

    public CalculatorService() {
        deque = new LinkedList<>();
        deque.addLast(new Pair<>("Number", "0"));
    }

    public String formString(Pair<String, String> pair) {
        Pair<String, String> last = deque.getLast();
        if (last.getKey().equals(pair.getKey()) && pair.getKey().equals("Number")) {
            removeAndAddLastPair(new Pair<>(last.getKey(), !last.getValue().equals("0") ?
                    last.getValue() + pair.getValue() : pair.getValue()));
        } else if (!last.getKey().equals(pair.getKey())) {
            if (last.getValue().endsWith(",")) {
                removeAndAddLastPair(new Pair<>(last.getKey(), last.getValue().substring(0, last.getValue().length() - 1)));
            }
            deque.addLast(pair);
        }
        return createStringFromDeque();
    }

    public String clear() {
        deque.clear();
        deque.addLast(new Pair<>("Number", "0"));
        return createStringFromDeque();
    }

    public String editComma(Pair<String, String> pair) {
        Pair<String, String> last = deque.getLast();
        if (last.getKey().equals(pair.getKey())) {
            if (!last.getValue().contains(","))
                removeAndAddLastPair(new Pair<>(last.getKey(), last.getValue() + pair.getValue()));
        } else {
            deque.addLast(new Pair<>(pair.getKey(), "0" + pair.getValue()));
        }
        return createStringFromDeque();
    }

    private String createStringFromDeque() {
        return deque.stream().map(Pair::getValue)
                .collect(Collectors.joining());
    }

    private void removeAndAddLastPair(Pair<String, String> pair) {
        deque.removeLast();
        deque.addLast(pair);
    }


}
