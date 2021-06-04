package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.AbilityCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.AbilityCandidate;

@RestController
@RequestMapping("/api/abilitiyCandidates")
public class AbiliityCandidateController {
	private AbilityCandidateService abilityCandidateService;
	
	@Autowired
	public AbiliityCandidateController(AbilityCandidateService abilityCandidateService) {
		super();
		this.abilityCandidateService = abilityCandidateService;
	}
	
	@GetMapping("/getAbilityCandidates")
	public DataResult<List<AbilityCandidate>> getAll(){
		return this.abilityCandidateService.getAll();
	}
	
	@PostMapping("/addAbilityCandidates")
	public Result add(@RequestBody AbilityCandidate abilityCandidate) {
		return this.abilityCandidateService.add(abilityCandidate);
	}
	
	@GetMapping("/getByCandidateId")
	public DataResult<List<AbilityCandidate>>  getByCandidateId(int candidateId){
		return this.abilityCandidateService.getByCandidateId(candidateId);
	}
}
