package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.AbilityCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.AbilityCandidateDao;
import kodlamaio.Hrms.entities.concretes.AbilityCandidate;


@Service
public class AbilitiyCandidateManager implements AbilityCandidateService{
	
	private AbilityCandidateDao abilityCandidateDao;
	@Autowired
	public AbilitiyCandidateManager(AbilityCandidateDao abilityCandidateDao) {
		super();
		this.abilityCandidateDao = abilityCandidateDao;
	}

	@Override
	public DataResult<List<AbilityCandidate>> getAll() {
		return new SuccessDataResult<List<AbilityCandidate>>(this.abilityCandidateDao.findAll());
	}

	@Override
	public Result add(AbilityCandidate abilityCandidate) {
		this.abilityCandidateDao.save(abilityCandidate);
		return new SuccessResult("Başarıyla eklendi.");
	}

	@Override
	public DataResult<List<AbilityCandidate>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<AbilityCandidate>>(this.abilityCandidateDao.getByCandidate_Id(candidateId));
	}

}
