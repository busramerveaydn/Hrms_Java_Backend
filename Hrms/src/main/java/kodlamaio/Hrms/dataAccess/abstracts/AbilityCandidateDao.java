package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.Hrms.entities.concretes.AbilityCandidate;

public interface AbilityCandidateDao  extends JpaRepository<AbilityCandidate, Integer>{
	List<AbilityCandidate> getByCandidate_Id(int candidateId);
}
