package kodlamaio.Hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisemens")
public class JobAdvertisementController {
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getByıIsActiveTrue")
	public DataResult<List<JobAdvertisement>> getBıIsActiveTrue(){
		return this.jobAdvertisementService.getByIsActiveTrue();
	}
	
	@GetMapping("/getByIsActiveTrueOrderByApplicationDeadLine")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByApplicationDeadLine(){
		return this.jobAdvertisementService.getByIsActiveTrueOrderByApplicationDeadLine();
	}
	
	@GetMapping("/getByIsActiveTrueAndEmployer_Id")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_Id(int id){
		return this.jobAdvertisementService.getByIsActiveTrueAndEmployer_Id(id);
	}
	
	@PostMapping("/addJobAdvertisemen")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementService.add(jobAdvertisement);
		return new SuccessResult("iş ilanı başarıyla eklendi");
	}
	
	
	
//	@PostMapping("/updatejobAdvertisementDate")
//	public Result update(@RequestBody int jobAdvertisementId,@RequestBody JobAdvertisement jobAdvertisement) {
//		return this.jobAdvertisementService.update(jobAdvertisementId, jobAdvertisement);
//		
//	}
}
