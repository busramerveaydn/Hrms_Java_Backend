package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.business.abstracts.CandidateResumeDetailService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidareResumeDetailDao;
import kodlamaio.Hrms.entities.concretes.CandidateResumeDetail;

@Service
public class CandidateResumeDetailManager implements CandidateResumeDetailService{
	private CandidareResumeDetailDao candidateResumeDetailDao;
	
	@Autowired
	public CandidateResumeDetailManager(CandidareResumeDetailDao candidateResumeDetailDao) {
		super();
		this.candidateResumeDetailDao = candidateResumeDetailDao;
	}

	@Override
	public DataResult<List<CandidateResumeDetail>> getAll() {
		return new SuccessDataResult<List<CandidateResumeDetail>>(this.candidateResumeDetailDao.findAll());
	}

	@Override
	public DataResult<CandidateResumeDetail> getByCandidateId(int candidateId) {
		return new SuccessDataResult<CandidateResumeDetail>(this.candidateResumeDetailDao.getByCandidate_Id(candidateId));
	}

	@Override
	public Result add(CandidateResumeDetail candidateResumeDetail) {
		this.candidateResumeDetailDao.save(candidateResumeDetail);
		return null;
	}

}
