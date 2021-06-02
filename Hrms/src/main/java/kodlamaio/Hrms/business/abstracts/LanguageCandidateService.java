package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.LanguageCandidate;

public interface LanguageCandidateService {
	
	DataResult<List<LanguageCandidate>> getAll();
	
	Result add(LanguageCandidate languageCandidate);
}
