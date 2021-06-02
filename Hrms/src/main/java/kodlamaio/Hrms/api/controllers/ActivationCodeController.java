package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.ActivationCodeService;
import kodlamaio.Hrms.entities.concretes.ActivationCode;

@RestController

@RequestMapping("/api/activation_codes")
public class ActivationCodeController {
	private ActivationCodeService activationCodeService;
	
	@Autowired
	public ActivationCodeController(ActivationCodeService activationCodeService) {
		super();
		this.activationCodeService = activationCodeService;
	}
	
	@GetMapping("/getActivationCodes")
	public List<ActivationCode> getAll(){
		return this.activationCodeService.getAll();
	}
}
