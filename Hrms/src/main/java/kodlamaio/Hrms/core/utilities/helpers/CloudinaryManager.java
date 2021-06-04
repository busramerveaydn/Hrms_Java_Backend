package kodlamaio.Hrms.core.utilities.helpers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryManager implements ImageUploadService{
	
	private Cloudinary cloudinary;
	
	public CloudinaryManager(Cloudinary cloudinary) {
		super();
		this.cloudinary = cloudinary;
	}
	
	@Override
	public DataResult<Map<String, String>> photoUpload(MultipartFile multipartFile){
		
		Map<String,String> uploadResultMap = null;
		
		try {
			File file = convert(multipartFile);
			uploadResultMap = this.cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
//			bellekte tutulan dosyayı silmek için
			file.delete();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SuccessDataResult<Map<String,String>>(uploadResultMap);
	}
	
//	multipartfile ı file a dönüştürür.
	private File convert(MultipartFile multipartFile) throws IOException{
		File file = new File(multipartFile.getOriginalFilename());
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(multipartFile.getBytes());
		fileOutputStream.close();
		return file;
	}
}
