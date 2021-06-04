package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.WorkplaceCandidate;

public interface WorkplaceCandidateService {
	
	DataResult<List<WorkplaceCandidate>> getAll();
	
	DataResult<List<WorkplaceCandidate>> getByCandidateId(int candidateId);
	
	Result add(WorkplaceCandidate workplaceCandidate);
}
