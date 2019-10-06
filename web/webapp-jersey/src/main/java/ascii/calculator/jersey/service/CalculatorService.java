package ascii.calculator.jersey.service;

import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/")
public class CalculatorService {

    @GET
    @Path("result/{expression}")
    @Produces("application/json")
    public Result computation(@PathParam("expression") String expr) {
//        return StringHelper.formatResult(expr, MathHelper.compute(StringHelper.cutStringToPairs(expr)));
//        return MathHelper.compute(StringHelper.cutStringToPairs(expr));
        return new Result(expr,
                StringHelper.formatResult(MathHelper.compute(StringHelper.cutStringToPairs(expr))));

    }
}
