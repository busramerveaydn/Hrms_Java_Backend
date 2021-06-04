package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.SchoolCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.SchoolCandidate;

@RestController
@RequestMapping("/api/school_candidates")
public class SchoolCandidateController {
	
	private SchoolCandidateService schoolCandidateService;
	
	@Autowired
	public SchoolCandidateController(SchoolCandidateService schoolCandidateService) {
		super();
		this.schoolCandidateService = schoolCandidateService;
	}
	
	@GetMapping("/getSchoolCandidate")
	public DataResult<List<SchoolCandidate>> getAll(){
		return this.schoolCandidateService.getAll();
	}
	
	@PostMapping("/addSchoolCandidate")
	public Result add(@RequestBody SchoolCandidate schoolCandidate) {
		return this.schoolCandidateService.add(schoolCandidate);
	}
	
	@GetMapping("/getByCandidateId")
	public DataResult<List<SchoolCandidate>> getByCandidateId(int candidateId){
		return this.schoolCandidateService.getByCandidateId(candidateId);
	}
}
