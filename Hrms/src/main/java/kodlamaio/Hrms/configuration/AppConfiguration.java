package kodlamaio.Hrms.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class AppConfiguration {
	
	@Bean
	public Cloudinary cloudinaryService() {
		return new Cloudinary(
			ObjectUtils.asMap(
					"cloud_name","bmacompany",
					"api_key","896336896974688",
					"api_secret","Bwk1pl8GgsirvRmZT1Y3_-n-Wrw"
			)			
		);
	}
}
