package kodlamaio.Hrms.entities.abstracts;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

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

public class User {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	

}
