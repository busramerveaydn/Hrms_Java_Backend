package kodlamaio.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//veri tabanı tablosuna karşılık gelecek

@Data //lombok ta get set getiriyo
@AllArgsConstructor //parametreli constructor
@NoArgsConstructor //parametresiz constructor
@Entity //veri tabanı bağlamak için
@Table(name = "job_titles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","workplaceCandidates"})
//name e verilen isim veri tabanındaki tablo ismine karşılık düşer.

public class JobTitle {
	
	//buradaki jobTitle class ı veri tabanında bir tabloya karşılık gelecek.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id artışı için veri tabanı ile senkronizasyon
	
	@Column(name = "id") //veri tabanında karşılık gelen sütuna karşılık geliyor.
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobTitle")
	private List<WorkplaceCandidate> workplaceCandidates;

}
