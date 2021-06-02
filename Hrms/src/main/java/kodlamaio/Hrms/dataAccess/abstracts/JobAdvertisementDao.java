package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> getByisActiveTrue();
	
	List<JobAdvertisement> getByIsActiveTrueOrderByApplicationDeadLine();
	
	List<JobAdvertisement> getByIsActiveTrueAndEmployer_Id(int id);
	
}
