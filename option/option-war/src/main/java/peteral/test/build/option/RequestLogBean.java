package peteral.test.build.option;

import java.sql.Timestamp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;

import peteral.test.build.option.entities.RequestLogEntity;

@Stateless
public class RequestLogBean {
	@PersistenceContext(unitName = "PU")
	private EntityManager em;
	
	public void logAccess(HttpServletRequest httpRequest) {
		RequestLogEntity entry = new RequestLogEntity();
		entry.setTs(new Timestamp(System.currentTimeMillis()));
		entry.setAddress(httpRequest.getRemoteAddr());
		
		em.persist(entry);
	}

}
