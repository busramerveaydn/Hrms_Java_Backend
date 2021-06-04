package kodlamaio.Hrms.entities.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import kodlamaio.Hrms.entities.concretes.AbilityCandidate;
import kodlamaio.Hrms.entities.concretes.Candidate;
import kodlamaio.Hrms.entities.concretes.CandidateResumeDetail;
import kodlamaio.Hrms.entities.concretes.LanguageCandidate;
import kodlamaio.Hrms.entities.concretes.SchoolCandidate;
import kodlamaio.Hrms.entities.concretes.SocialMedia;
import kodlamaio.Hrms.entities.concretes.WorkplaceCandidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateResumeDto {
	@JsonIgnore
	private Candidate candidate;
	
	private List<SchoolCandidate> schoolCandidates;
	
	private List<LanguageCandidate> languageCandidates;
	
	private List<WorkplaceCandidate> workplaceCandidates;
	
	private List<SocialMedia> socialMedias;
	
	private List<AbilityCandidate> abilityCandidates;
	
	private CandidateResumeDetail candidateResumeDetail; 
}
