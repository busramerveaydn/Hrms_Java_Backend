package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employee;

public interface EmployeeService {
	
	Result add(Employee employee);
	
	DataResult<List<Employee>> getAll();
}
