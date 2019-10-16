package ascii.calculator.jersey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class CalculatorResult implements Serializable {

    private String expression;
    private String result;
    private String[] matrix;
}
