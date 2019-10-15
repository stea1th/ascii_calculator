package ascii.calculator.jersey.controller;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;
import ascii.calculator.jersey.model.Result;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

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
}
