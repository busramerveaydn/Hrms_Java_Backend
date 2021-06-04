package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.AbilityCandidate;

public interface AbilityCandidateService {
	
	DataResult<List<AbilityCandidate>> getAll();
	
	DataResult<List<AbilityCandidate>>  getByCandidateId(int candidateId);
	
	Result add(AbilityCandidate abilityCandidate);
}
