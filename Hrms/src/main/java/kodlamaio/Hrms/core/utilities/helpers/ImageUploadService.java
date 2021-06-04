package kodlamaio.Hrms.core.utilities.helpers;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.Hrms.core.utilities.results.DataResult;

public interface ImageUploadService {
	DataResult<Map<String,String>> photoUpload(MultipartFile file);
}
