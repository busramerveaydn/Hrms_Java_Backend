package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.LanguageCandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.LanguageCandidate;

@RestController
@RequestMapping("/api/language_candidates")
public class LanguageCandidateController {
	private LanguageCandidateService languageCandidateService;
	
	@Autowired
	public LanguageCandidateController(LanguageCandidateService languageCandidateService) {
		super();
		this.languageCandidateService = languageCandidateService;
	}
	
	@GetMapping("/getLanguageCandidates")
	public DataResult<List<LanguageCandidate>> getAll(){
		return this.languageCandidateService.getAll();
	}
	
	@PostMapping("/addLanguageCandidates")
	public Result add(@RequestBody LanguageCandidate languageCandidate) {
		return this.languageCandidateService.add(languageCandidate);
	}
}
