package ascii.calculator.jersey.service;

import ascii.calculator.jersey.model.User;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Service
@Path("/")
public class CalculatorService {

    @GET
    @Produces("application/json")
    public User hello() {
        User user = new User("Peter", "Pavlov");
        return user;
    }
}
