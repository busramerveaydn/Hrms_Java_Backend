package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.Hrms.entities.concretes.WorkplaceCandidate;

public interface WorkplaceCandidateDao extends JpaRepository<WorkplaceCandidate, Integer>{
	List<WorkplaceCandidate> getByCandidate_Id(int candidateId);
}
