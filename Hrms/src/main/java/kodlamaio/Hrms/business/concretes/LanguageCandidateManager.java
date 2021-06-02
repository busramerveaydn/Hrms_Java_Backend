package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.LanguageCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.LanguageCandidateDao;
import kodlamaio.Hrms.entities.concretes.LanguageCandidate;

@Service
public class LanguageCandidateManager implements LanguageCandidateService{
	
	private LanguageCandidateDao languageCandidateDao;
	
	@Autowired
	public LanguageCandidateManager(LanguageCandidateDao languageCandidateDao) {
		super();
		this.languageCandidateDao = languageCandidateDao;
	}

	@Override
	public DataResult<List<LanguageCandidate>> getAll() {
		return new SuccessDataResult<List<LanguageCandidate>>(this.languageCandidateDao.findAll());
	}

	@Override
	public Result add(LanguageCandidate languageCandidate) {
		this.languageCandidateDao.save(languageCandidate);
		return new SuccessResult("Başarıyla eklendi.");
	}

}
