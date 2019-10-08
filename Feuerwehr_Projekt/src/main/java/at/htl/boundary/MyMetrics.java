package at.htl.boundary;

import at.htl.dao.MemberDao;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class MyMetrics {

    @Inject
    MemberDao memberDao;

    @GET
    @Path("/fireBrigadeLength")
    @Produces("text/plain")
    @Counted(name = "performedChecks", description = "How many checks have been performed.")
    @Timed(name = "checksTimer", description = "A measure of how long it takes to perform the check.", unit = MetricUnits.MILLISECONDS)
    public Integer getTodoLength() {
        return this.memberDao.getAll().size();
    }

}
