package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.business.abstracts.CandidateResumeDetailService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.CandidateResumeDetail;


@RestController
@RequestMapping("/api/candidateResumeDetails")
public class CandidateResumeDetailController {
	
	private CandidateResumeDetailService candidateResumeDetailService;
	
	@Autowired
	public CandidateResumeDetailController(CandidateResumeDetailService candidateResumeDetailService) {
		super();
		this.candidateResumeDetailService = candidateResumeDetailService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateResumeDetail>> getAll(){
		return this.candidateResumeDetailService.getAll();
	}
	
	@GetMapping("/getCandidateId")
	public DataResult<CandidateResumeDetail> getByCandidateId(int candidateId){
		return this.candidateResumeDetailService.getByCandidateId(candidateId);
	}	
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateResumeDetail candidateResumeDetail) {
		return this.candidateResumeDetailService.add(candidateResumeDetail);
	}
}
