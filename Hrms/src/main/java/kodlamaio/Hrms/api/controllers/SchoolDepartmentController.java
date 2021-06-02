package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.SchoolDepartmentService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.SchoolDepartment;

@RestController
@RequestMapping("/api/school_departments")
public class SchoolDepartmentController {
	
	private SchoolDepartmentService schoolDepartmentService;
	
	@Autowired
	public SchoolDepartmentController(SchoolDepartmentService schoolDepartmentService) {
		super();
		this.schoolDepartmentService = schoolDepartmentService;
	}
	
	@GetMapping("/getSchoolDepartment")
	public DataResult<List<SchoolDepartment>> getAll(){
		
		return this.schoolDepartmentService.getAll();
	}
	
	@PostMapping("/addSchoolDepartment")
	public Result add(@RequestBody SchoolDepartment schoolDepartment) {
		
		return this.schoolDepartmentService.add(schoolDepartment);
		
	}
}
