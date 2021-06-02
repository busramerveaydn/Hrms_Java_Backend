package kodlamaio.Hrms.core.adapters.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.adapters.abstracts.SimulatedMernisService;

@Service
public class SimulatedMernisManager implements SimulatedMernisService{

	@Override
	public boolean checkMernis(String firstName, String lastName, String identityNumber, String birthYerar) {
		if (firstName.length() < 2 || lastName.length() < 2) {
			System.out.println("Adınız ve soyadınız en az 2 karakter olmalıdır.");
			return false;
		}
		
		if (identityNumber.length() != 11) {
			System.out.println("T.C. niz en az 11 karakterden oluşmalıdır.");
			return false;
		}
		
		if (birthYerar.length() != 4) {
			System.out.println("Doğum yılınız 4 haneden oluşmalıdır.");
			return false;
		}
		else {
			System.out.println("Kimlik Doğrulama Başarılı!");
			return true;
		}
	}

}
