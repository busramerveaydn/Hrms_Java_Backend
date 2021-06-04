package kodlamaio.Hrms.entities.abstracts;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.Hrms.entities.concretes.ActivationCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data

@EqualsAndHashCode(callSuper = false)

@AllArgsConstructor

@NoArgsConstructor

@Entity

@Inheritance(strategy = InheritanceType.JOINED)

@Table(name = "users")

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","activationCodes"})
public class User {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private int password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user")
	private List<ActivationCode> activationCodes;

}
