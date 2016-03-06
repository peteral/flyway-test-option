package rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import peteral.test.build.option.JournalService;

@ApplicationPath("/rest")
public class RestApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> result = new HashSet<>();
		
		result.add(JournalService.class);
		
		return result;
	}
}
