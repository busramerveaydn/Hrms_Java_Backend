package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.AbilityService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Ability;

@RestController
@RequestMapping("/api/abilities")
public class AbilityController {
	
	private AbilityService abilityService;
	
	@Autowired
	public AbilityController(AbilityService abilityService) {
		super();
		this.abilityService = abilityService;
	}
	
	@GetMapping("/getAbilities")
	public DataResult<List<Ability>> getAll(){
		return this.abilityService.getAll();
	}
	
	@PostMapping("/addAbility")
	public Result add(@RequestBody Ability ability) {
		return this.abilityService.add(ability);
	}
	
}
