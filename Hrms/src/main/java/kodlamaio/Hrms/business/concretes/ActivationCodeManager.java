package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.ActivationCodeService;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.ActivationCodeDao;
import kodlamaio.Hrms.entities.concretes.ActivationCode;

@Service
public class ActivationCodeManager implements ActivationCodeService{
	
	private ActivationCodeDao verificationCodeDao;
	@Autowired
	
	public ActivationCodeManager(ActivationCodeDao activationCodeDao) {
		super();
		this.verificationCodeDao = activationCodeDao;
	}

	@Override
	public Result add(ActivationCode activationCode) {
		
		this.verificationCodeDao.save(activationCode);
		
		return new SuccessResult("Kod Kaydedildi");
	}

	@Override
	public List<ActivationCode> getAll() {
		return this.verificationCodeDao.findAll();
	}

}
