package ascii.calculator.jersey.service;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Service
@Path("/")
public class CalculatorService {

    @GET
    @Produces("application/json")
    public String hello() {
        return "Hello from spring";
    }
}
