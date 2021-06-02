package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.SchoolDepartment;

public interface SchoolDepartmentService {
	
	DataResult<List<SchoolDepartment>> getAll();
	
	Result add(SchoolDepartment schoolDepartment);
	
}
