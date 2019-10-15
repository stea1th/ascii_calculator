package ascii.calculator.jersey.controller;

import ascii.calculator.console.helpers.SignHelper;
import ascii.calculator.console.signs.SignInterface;
import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;
import ascii.calculator.jersey.model.Result;
import org.springframework.stereotype.Component;

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

    @GET
    @Path("ascii")
    @Produces("application/json")
    public String[] asciiComputation(@QueryParam("num") String num) {
        return SignHelper.transformStringToArray(num);
    }
}
