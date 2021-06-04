package kodlamaio.Hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.business.abstracts.CandidateResumeDetailService;
import kodlamaio.Hrms.core.utilities.helpers.ImageUploadService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidareResumeDetailDao;
import kodlamaio.Hrms.entities.concretes.CandidateResumeDetail;

@Service
public class CandidateResumeDetailManager implements CandidateResumeDetailService{
	private CandidareResumeDetailDao candidateResumeDetailDao;
	private ImageUploadService imageUploadService;
	
	@Autowired
	public CandidateResumeDetailManager(CandidareResumeDetailDao candidateResumeDetailDao,
			ImageUploadService imageUploadService) {
		super();
		this.candidateResumeDetailDao = candidateResumeDetailDao;
		this.imageUploadService = imageUploadService;
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

	@Override
	public Result photoUpload(MultipartFile file,int candidateId) {
		
		CandidateResumeDetail candidateResumeDetail = getByCandidateId(candidateId).getData();
		
		Map<String, String> resultMap = (Map<String, String>) this.imageUploadService.photoUpload(file).getData();
		
		String url = resultMap.get("url");
		
		candidateResumeDetail.setCvPhotoUrl(url);
		
		candidateResumeDetailDao.save(candidateResumeDetail);
		
		return null;
	}

}
