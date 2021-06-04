package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.business.abstracts.WorkplaceCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.WorkplaceCandidateDao;
import kodlamaio.Hrms.entities.concretes.WorkplaceCandidate;


@Service
public class WorkplaceCandidateManager implements WorkplaceCandidateService{
	private WorkplaceCandidateDao workplaceCandidateDao;
	@Autowired
	public WorkplaceCandidateManager(WorkplaceCandidateDao workplaceCandidateDao) {
		super();
		this.workplaceCandidateDao = workplaceCandidateDao;
	}

	@Override
	public DataResult<List<WorkplaceCandidate>> getAll() {
		return new SuccessDataResult<List<WorkplaceCandidate>>(this.workplaceCandidateDao.findAll());
	}

	@Override
	public Result add(WorkplaceCandidate workplaceCandidate) {
		this.workplaceCandidateDao.save(workplaceCandidate);
		return null;
	}

	@Override
	public DataResult<List<WorkplaceCandidate>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<WorkplaceCandidate>>(this.workplaceCandidateDao.getByCandidate_Id(candidateId));
	}

}
