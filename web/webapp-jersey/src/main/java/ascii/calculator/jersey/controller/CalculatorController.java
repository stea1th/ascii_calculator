package ascii.calculator.jersey.controller;

import ascii.calculator.console.helpers.SignHelper;
import ascii.calculator.helpers.MathHelper;
import ascii.calculator.helpers.StringHelper;
import ascii.calculator.jersey.model.Result;
import ascii.calculator.jersey.service.CalculatorService;
import javafx.util.Pair;
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
        result.setResult(StringHelper.onlyResult(MathHelper.compute(StringHelper.cutStringToPairs(result.getExpression()))));
        return result;
    }

    @GET
    @Path("ascii/number")
    @Produces("application/json")
    public String[] getAsciiNumber(@QueryParam("num") String num) {
        return SignHelper.transformStringToArray(!num.equals(",") ? service.formString(new Pair<>("Number", num)) :
                        service.editComma(new Pair<>("Number", num)));
    }

    @GET
    @Path("ascii/clear")
    @Produces("application/json")
    public String[] clear() {
        return SignHelper.transformStringToArray(service.clear());
    }

    @GET
    @Path("ascii/action")
    @Produces("application/json")
    public String[] getAction(@QueryParam("num") String num) {
        return SignHelper.transformStringToArray(service.formString(new Pair<>("Action", num)));
    }


}
