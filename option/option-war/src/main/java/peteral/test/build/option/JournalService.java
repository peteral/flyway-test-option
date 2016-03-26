package peteral.test.build.option;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import peteral.test.build.platformapi.Journal;

@Stateless
@Path("journal")
public class JournalService {
	@EJB(lookup = Journal.LOOKUP)
	Journal journal;
	
	@POST
	public Response log(@FormParam("message")String message) {
		journal.log(message);
		
		return Response.ok().build();
	}
}
