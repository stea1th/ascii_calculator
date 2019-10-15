package ascii.calculator.jersey.controller;

import ascii.calculator.console.helpers.SignHelper;
import ascii.calculator.console.signs.SignInterface;
import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;
import ascii.calculator.jersey.model.Result;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import java.util.List;

@Path("/")
@Component
public class CalculatorController {

    @POST
    @Path("result")
    @Consumes("application/json")
    @Produces("application/json")
    public Result computation(Result result) {
        result.setResult(StringHelper.onlyResult(MathHelper.compute(StringHelper.cutStringToPairs(result.getExpression()))));
        return result;
    }

    @POST
    @Path("ascii")
    @Consumes("application/json")
    @Produces("application/json")
    public List<SignInterface> asciiComputation(Result result) {
        System.out.println("Hi!!!");
        return SignHelper.transformToList(result.getExpression());
    }

}
