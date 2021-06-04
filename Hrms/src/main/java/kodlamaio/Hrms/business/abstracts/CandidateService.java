package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Candidate;
import kodlamaio.Hrms.entities.dtos.CandidateResumeDto;

public interface CandidateService {
	
	Result add(Candidate candidate);
	
	DataResult<List<Candidate>> getAll();
	
	DataResult<CandidateResumeDto> getCandidateCvByCandidateId(int candidateId);
	
}
