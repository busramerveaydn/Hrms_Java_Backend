package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.SocialMedia;

public interface SocialMediaService {
	
	DataResult<List<SocialMedia>> getAll();
	
	DataResult<List<SocialMedia>>  getByCandidateId(int candidateId);
	
	Result add(SocialMedia socialMedia);
}
