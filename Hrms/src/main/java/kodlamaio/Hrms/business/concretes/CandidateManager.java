package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.AbilityCandidateService;
import kodlamaio.Hrms.business.abstracts.CandidateResumeDetailService;
import kodlamaio.Hrms.business.abstracts.CandidateService;
import kodlamaio.Hrms.business.abstracts.LanguageCandidateService;
import kodlamaio.Hrms.business.abstracts.SchoolCandidateService;
import kodlamaio.Hrms.business.abstracts.SocialMediaService;
import kodlamaio.Hrms.business.abstracts.WorkplaceCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.entities.concretes.Candidate;
import kodlamaio.Hrms.entities.dtos.CandidateResumeDto;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	
	private SchoolCandidateService schoolCandidateService;
	
	private AbilityCandidateService abilityCandidateService;
	
	private LanguageCandidateService languageCandidateService;
	
	private WorkplaceCandidateService workplaceCandidateService;
	
	private SocialMediaService socialMediaService;
	
	private CandidateResumeDetailService candidateResumeDetailService;
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, SchoolCandidateService schoolCandidateService,
			AbilityCandidateService abilityCandidateService, LanguageCandidateService languageCandidateService,
			WorkplaceCandidateService workplaceCandidateService, SocialMediaService socialMediaService,
			CandidateResumeDetailService candidateResumeDetailService) {
		super();
		this.candidateDao = candidateDao;
		this.schoolCandidateService = schoolCandidateService;
		this.abilityCandidateService = abilityCandidateService;
		this.languageCandidateService = languageCandidateService;
		this.workplaceCandidateService = workplaceCandidateService;
		this.socialMediaService = socialMediaService;
		this.candidateResumeDetailService = candidateResumeDetailService;
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Aday başarıyla eklendi.");
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

	@Override
	public DataResult<CandidateResumeDto> getCandidateCvByCandidateId(int candidateId) {
		CandidateResumeDto candidateResumeDto = new CandidateResumeDto();
		
		candidateResumeDto.setCandidate(this.candidateDao.findById(candidateId).get());
		
		candidateResumeDto.setSchoolCandidates(this.schoolCandidateService.getByCandidateId(candidateId).getData());
		
		candidateResumeDto.setAbilityCandidates(this.abilityCandidateService.getByCandidateId(candidateId).getData());
		
		candidateResumeDto.setLanguageCandidates(this.languageCandidateService.getByCandidateId(candidateId).getData());
		
		candidateResumeDto.setWorkplaceCandidates(this.workplaceCandidateService.getByCandidateId(candidateId).getData());
		
		candidateResumeDto.setSocialMedias(this.socialMediaService.getByCandidateId(candidateId).getData());
		
		candidateResumeDto.setCandidateResumeDetail(this.candidateResumeDetailService.getByCandidateId(candidateId).getData());
		
		return new SuccessDataResult<CandidateResumeDto>(candidateResumeDto, "CV");
	}

}
