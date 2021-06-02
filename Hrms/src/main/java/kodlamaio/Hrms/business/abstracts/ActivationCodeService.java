package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ActivationCode;

public interface ActivationCodeService {
	Result add(ActivationCode activationCode);
	
	List<ActivationCode> getAll();
	
}
