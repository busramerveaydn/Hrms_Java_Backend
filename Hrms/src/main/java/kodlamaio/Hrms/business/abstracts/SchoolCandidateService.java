package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.SchoolCandidate;

public interface SchoolCandidateService {
	
	DataResult<List<SchoolCandidate>> getAll();
	
	DataResult<List<SchoolCandidate>> getByCandidateId(int candidateId);
	
	Result add(SchoolCandidate schoolCandidate);
}
