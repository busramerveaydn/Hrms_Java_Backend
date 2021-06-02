package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.SchoolCandidate;

public interface SchoolCandidateDao extends JpaRepository<SchoolCandidate, Integer>{

}
