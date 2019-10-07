package ascii.calculator.jersey.service;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;
import ascii.calculator.jersey.model.Result;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Service
@Path("/")
public class CalculatorService {

    @POST
    @Path("result")
    @Consumes("application/json")
    @Produces("application/json")
    public Result computation(Result result) {
        result.setResult(StringHelper.onlyResult(MathHelper.compute(StringHelper.cutStringToPairs(result.getExpression()))));
        return result;
    }
}
