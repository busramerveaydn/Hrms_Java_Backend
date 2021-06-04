package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.Workplace;

public interface WorkplaceService {
	
	DataResult<List<Workplace>> getAll();
	
	Result add(Workplace workplace);
}
