package ascii.calculator.jersey.controller;

import ascii.calculator.helpers.StringHelper;
import ascii.calculator.jersey.model.CalculatorResult;
import ascii.calculator.jersey.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;

@Path("/")
@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService service;

    @POST
    @Path("result")
    @Consumes("application/json")
    @Produces("application/json")
    public CalculatorResult computation(CalculatorResult calculatorResult) {
        calculatorResult.setResult(StringHelper.onlyResult(calculatorResult.getExpression()));
        return calculatorResult;
    }

    @GET
    @Path("ascii/number")
    @Produces("application/json")
    public CalculatorResult getAsciiNumber(@QueryParam("num") String num) {
        return service.createResult(num);
    }

}
