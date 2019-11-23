package at.htl.firedepartment.vehicle.boundary;

import at.htl.firedepartment.vehicle.entity.Vehicle;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/vehicle")
@RegisterRestClient
public interface VehicleService {

    @GET
    @Path("/findAll")
    @Produces("application/json")
    List<Vehicle> getVehicles();

}
