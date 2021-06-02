package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Department;

public interface DepartmentService {
	
	DataResult<List<Department>> getAll();
	
	Result add(Department department);
}
