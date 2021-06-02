package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.LanguageCandidate;

public interface LanguageCandidateDao extends JpaRepository<LanguageCandidate, Integer>{

}
