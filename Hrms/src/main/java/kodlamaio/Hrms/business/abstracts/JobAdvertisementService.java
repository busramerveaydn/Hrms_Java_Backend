package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getByIsActiveTrue();
	
	DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByApplicationDeadLine();
	
	DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_Id(int id);
	
	Result add(JobAdvertisement jobAdvertisement);
		

}
