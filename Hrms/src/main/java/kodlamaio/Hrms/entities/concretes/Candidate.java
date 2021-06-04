package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.Hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data


@Entity

@Table(name = "candidates")

@EqualsAndHashCode(callSuper = false)

@NoArgsConstructor

@AllArgsConstructor

@JsonIgnoreProperties({"hibernateLazyInitializer","handler",
	"schoolCandidates","languageCandidates",
	"abilityCandidates","workplaceCandidates",
	"socialMedias","candidateResumeDetail"})

public class Candidate extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<SchoolCandidate> schoolCandidates;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<LanguageCandidate> languageCandidates;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<AbilityCandidate> abilityCandidates;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<WorkplaceCandidate> workplaceCandidates;
		
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<SocialMedia> socialMedias;
	
	@JsonIgnore
	@OneToOne(mappedBy = "candidate")
	private CandidateResumeDetail candidateResumeDetail;
}
