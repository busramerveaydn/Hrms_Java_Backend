package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.abstracts.User;

public interface UserService {	
	DataResult<List<User>> gettAll();
}
