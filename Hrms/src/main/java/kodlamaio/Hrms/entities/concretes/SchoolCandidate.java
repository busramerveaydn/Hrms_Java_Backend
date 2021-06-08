package kodlamaio.Hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity

@AllArgsConstructor

@NoArgsConstructor

@Table(name="school_candidates")
public class SchoolCandidate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "school_department_id")
	private SchoolDepartment schoolDepartment;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@Column(name = "date_of_entry")
	private Date dateOfEntry;
	
	@Column(name = "date_of_graduation")
	private Date dateOfGraduation;
}
