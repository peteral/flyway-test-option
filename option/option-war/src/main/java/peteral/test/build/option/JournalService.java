package peteral.test.build.option;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import peteral.test.build.platformapi.Journal;

@Stateless
@Path("journal")
public class JournalService {
	@EJB(lookup = Journal.LOOKUP)
	Journal journal;
	
	@Context
	private HttpServletRequest httpRequest;

	@EJB
	RequestLogBean requestLogBean;
	
	@POST
	public Response log(@FormParam("message")String message, @FormParam("parameter") String parameter) {
		requestLogBean.logAccess(httpRequest);
		
		if (parameter != null)
			journal.log(message, parameter.split("\\,"));
		else
			journal.log(message);
		
		return Response.ok().build();
	}
}
