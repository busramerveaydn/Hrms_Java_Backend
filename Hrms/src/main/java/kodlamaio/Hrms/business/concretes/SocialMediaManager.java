package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.SocialMediaService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.SocialMediaDao;
import kodlamaio.Hrms.entities.concretes.SocialMedia;

@Service
public class SocialMediaManager implements SocialMediaService{
	
	private SocialMediaDao socialMediaDao;
	@Autowired
	public SocialMediaManager(SocialMediaDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public DataResult<List<SocialMedia>> getAll() {
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAll());
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult("Başarıyla eklendi.");
	}

	@Override
	public DataResult<List<SocialMedia>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.getByCandidate_Id(candidateId));
	}

}
