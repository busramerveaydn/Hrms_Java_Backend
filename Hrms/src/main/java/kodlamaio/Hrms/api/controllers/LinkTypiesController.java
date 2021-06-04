package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.LinkTypeService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.LinkType;

@RestController
@RequestMapping("/api/linkTypies")
public class LinkTypiesController {

	private LinkTypeService linkTypeService;
	@Autowired
	public LinkTypiesController(LinkTypeService linkTypeService) {
		super();
		this.linkTypeService = linkTypeService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<LinkType>> getAll(){
		return this.linkTypeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody LinkType linkType) {
		return this.linkTypeService.add(linkType);
	}
	
}
