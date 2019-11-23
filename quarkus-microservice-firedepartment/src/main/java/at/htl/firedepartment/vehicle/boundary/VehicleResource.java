package at.htl.firedepartment.vehicle.boundary;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class VehicleResource {

    @Inject
    @RestClient
    VehicleService vehicleService;

    @GET
    @Path("/vehicles/count")
    @Produces(MediaType.TEXT_PLAIN)
    @Timeout(2000)
    @Retry(maxRetries = 3)
    @Fallback(fallbackMethod = "fallbackNumberOfVehicles")
    @Counted(name = "getNumberOfVehicles_called" )
    @Timed(name= "timer", description = "How long it takes to perform this task", unit = MetricUnits.MILLISECONDS)
    public int getNumberOfRegisteredVehicles() {
        return vehicleService.getVehicles().size();
    }

    int fallbackNumberOfVehicles(){
        return 0;
    }

    @GET
    @Path("/vehicles/avg/mileage")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getAvgMileage_called" )
    public double getAvgMileage(){
        return vehicleService.getVehicles().stream().mapToDouble(g -> g.getMileage()).average().getAsDouble();
    }


}
