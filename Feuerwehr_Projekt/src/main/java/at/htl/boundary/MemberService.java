package at.htl.boundary;

import at.htl.entity.Member;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/member/findAll")
@RegisterRestClient
public interface MemberService {

    @GET
    @Produces("application/json")
    List<Member> getMember();

}
