package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "activation_codes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivationCode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "activation_code")
	private String activationCode;
	
	@Column(name = "is_confirmed")
	private boolean isCpnfirmed;
	
	@Column(name = "confirmedDate", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate confirmedDate = LocalDate.now();
}
