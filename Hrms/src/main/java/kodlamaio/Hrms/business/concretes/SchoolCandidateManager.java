package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.SchoolCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.SchoolCandidateDao;
import kodlamaio.Hrms.entities.concretes.SchoolCandidate;

@Service
public class SchoolCandidateManager implements SchoolCandidateService{
	
	private SchoolCandidateDao schoolcandidateDao;
	
	@Autowired
	public SchoolCandidateManager(SchoolCandidateDao schoolcandidateDao) {
		super();
		this.schoolcandidateDao = schoolcandidateDao;
	}

	@Override
	public DataResult<List<SchoolCandidate>> getAll() {
		return new SuccessDataResult<List<SchoolCandidate>>(this.schoolcandidateDao.findAll());
	}

	@Override
	public Result add(SchoolCandidate schoolCandidate) {
		this.schoolcandidateDao.save(schoolCandidate);
		return new SuccessResult("Başarıyla eklendi.");
	}

	@Override
	public DataResult<List<SchoolCandidate>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<SchoolCandidate>>(this.schoolcandidateDao.getByCandidate_Id(candidateId));
	}

}
