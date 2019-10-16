package ascii.calculator.jersey.controller;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;
import ascii.calculator.jersey.model.Result;
import ascii.calculator.jersey.service.CalculatorService;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import static ascii.calculator.jersey.service.CalculatorService.*;

@Path("/")
@Component
public class CalculatorController {

    @Autowired
    CalculatorService service;

    @POST
    @Path("result")
    @Consumes("application/json")
    @Produces("application/json")
    public Result computation(Result result) {
        result.setResult(StringHelper.onlyResult(MathHelper.compute(StringHelper.cutStringToPairs(result.getExpression()))));
        return result;
    }

    @GET
    @Path("ascii/number")
    @Produces("application/json")
    public String[] getAsciiNumber(@QueryParam("num") String num) {
        Pair<String, String> pair = new Pair<>(NUMBER, num);
        switch (num) {
            case COMMA:
                return service.editComma(pair);
            case MINUS:
                return service.editNegation(pair);
            case DELETE_ALL:
                return service.deleteAll();
            case DELETE_LAST:
                return service.deleteLast();
            default:
                return service.formString(pair);
        }
    }

    @GET
    @Path("ascii/action")
    @Produces("application/json")
    public String[] getAction(@QueryParam("num") String num) {
        return service.formString(new Pair<>(ACTION, num));
    }


}
