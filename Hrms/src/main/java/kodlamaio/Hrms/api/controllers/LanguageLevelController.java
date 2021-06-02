package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.LanguageLevelService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.LanguageLevel;

@RestController
@RequestMapping("/api/language_levels")
public class LanguageLevelController {
	private LanguageLevelService languageLevelService;
	
	@Autowired
	public LanguageLevelController(LanguageLevelService languageLevelService) {
		super();
		this.languageLevelService = languageLevelService;
	}
	
	@GetMapping("/getLanguageLevel")
	public DataResult<List<LanguageLevel>> getAll(){
		return this.languageLevelService.getAll();
	}
	
	@PostMapping("addLanguageLevel")
	public Result add(@RequestBody LanguageLevel languageLevel) {
		return this.languageLevelService.add(languageLevel);
	}
}
