package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.LinkTypeService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.LinkTypeDao;
import kodlamaio.Hrms.entities.concretes.LinkType;

@Service
public class LinkTypeManager implements LinkTypeService{
	private LinkTypeDao linkTypeDao;
	
	@Autowired
	public LinkTypeManager(LinkTypeDao linkTypeDao) {
		super();
		this.linkTypeDao = linkTypeDao;
	}

	@Override
	public DataResult<List<LinkType>> getAll() {
		return new SuccessDataResult<List<LinkType>>(this.linkTypeDao.findAll());
	}

	@Override
	public Result add(LinkType linkType) {
		this.linkTypeDao.save(linkType);
		return new SuccessResult("Başarıyla eklendi");
	}

}
