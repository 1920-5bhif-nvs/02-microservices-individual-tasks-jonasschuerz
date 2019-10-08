package at.htl.boundary;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import javax.enterprise.context.ApplicationScoped;

@Liveness
@ApplicationScoped
public class MyHealthCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call(){
        return HealthCheckResponse.named("do Health Check").up().build();
    }
}
