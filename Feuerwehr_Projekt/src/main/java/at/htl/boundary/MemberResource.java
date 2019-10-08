package at.htl.boundary;

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
public class MemberResource {

    @Inject
    @RestClient
    MemberService memberService;

    @GET
    @Path("/member/count")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "performedChecks" )
    @Timed(name= "checksTimer", description = "How long it takes to perform this task", unit = MetricUnits.MILLISECONDS)
    public int getNumberOfMembers() {
        return memberService.getMember().size();
    }




}
