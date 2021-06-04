package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.CandidateResumeDetail;

public interface CandidareResumeDetailDao extends JpaRepository<CandidateResumeDetail, Integer>{
	CandidateResumeDetail getByCandidate_Id(int candidateId);
}
