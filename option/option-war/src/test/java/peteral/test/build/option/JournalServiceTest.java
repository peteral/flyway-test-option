package peteral.test.build.option;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import peteral.test.build.platformapi.Journal;

public class JournalServiceTest {
	@Mock
	private Journal journal;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void log_any_returns_ok() throws Exception {
		JournalService journalService = new JournalService();
		journalService.journal = journal;
		assertEquals(HttpServletResponse.SC_OK, journalService.log("").getStatus());
	}
}
