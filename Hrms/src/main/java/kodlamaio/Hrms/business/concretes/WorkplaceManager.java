package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.Hrms.business.abstracts.WorkplaceService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.WorkPlaceDao;
import kodlamaio.Hrms.entities.concretes.Workplace;

@Service
public class WorkplaceManager implements WorkplaceService{

	private WorkPlaceDao workplaceDao;
	
	@Autowired
	public WorkplaceManager(WorkPlaceDao workplaceDao) {
		super();
		this.workplaceDao = workplaceDao;
	}

	@Override
	public DataResult<List<Workplace>> getAll() {
		return new SuccessDataResult<List<Workplace>>(this.workplaceDao.findAll());
	}

	@Override
	public Result add(Workplace workplace) {
		this.workplaceDao.save(workplace);
		return null;
	}

}
