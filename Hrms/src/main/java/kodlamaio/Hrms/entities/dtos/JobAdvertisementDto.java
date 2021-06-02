package kodlamaio.Hrms.entities.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
	private String companyName;
	private String jobTitle;
	private int quota;
	private LocalDateTime jobAdvertisementDate;
	private String applicationDeadLine;
}
