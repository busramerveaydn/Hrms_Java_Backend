package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.business.abstracts.WorkplaceCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.WorkplaceCandidate;


@RestController
@RequestMapping("/api/workplaceCandidates")
public class WorkplaceCandidatesController {
	private WorkplaceCandidateService workplaceCandidateService;
	
	@Autowired
	public WorkplaceCandidatesController(WorkplaceCandidateService workplaceCandidateService) {
		super();
		this.workplaceCandidateService = workplaceCandidateService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<WorkplaceCandidate>> getAll(){
		return this.workplaceCandidateService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WorkplaceCandidate workplaceCandidate) {
		return this.workplaceCandidateService.add(workplaceCandidate);
	}
	
	@GetMapping("/getByCandidateId")
	public DataResult<List<WorkplaceCandidate>> getByCandidateId(int candidateId){
		return this.workplaceCandidateService.getByCandidateId(candidateId);
	}
}
