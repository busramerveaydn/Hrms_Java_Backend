package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.CandidateResumeDetail;

public interface CandidateResumeDetailService {
	
	DataResult<List<CandidateResumeDetail>> getAll();
	
	DataResult<CandidateResumeDetail> getByCandidateId(int candidateId);
	
	Result add( CandidateResumeDetail candidateResumeDetail);
}
