package ascii.calculator.jersey.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {

    private String expression;
    private String result;
}
