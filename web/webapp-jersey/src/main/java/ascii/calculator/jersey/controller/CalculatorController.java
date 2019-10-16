package ascii.calculator.jersey.controller;

import ascii.calculator.helpers.StringHelper;
import ascii.calculator.jersey.model.Result;
import ascii.calculator.jersey.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

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
        result.setResult(StringHelper.onlyResult(result.getExpression()));
        return result;
    }

    @GET
    @Path("ascii/number")
    @Produces("application/json")
    public String[] getAsciiNumber(@QueryParam("num") String num) {
        return service.getMatrix(num);
    }

}
