package at.htl.boundary;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.HealthCheckResponseBuilder;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Liveness
@ApplicationScoped
public class MyHealthCheck implements HealthCheck {

    @Inject
    @RestClient
    MemberService memberService;

    @PostConstruct
    public void initClient(){

    }

    @Override
    public HealthCheckResponse call(){
        HealthCheckResponseBuilder responseBuilder = HealthCheckResponse.named("FF Server Status");
        try{
            memberService.getMember();
            responseBuilder.up();
        } catch (Exception e){
            responseBuilder.down();
        }
        return responseBuilder.build();
    }
}
