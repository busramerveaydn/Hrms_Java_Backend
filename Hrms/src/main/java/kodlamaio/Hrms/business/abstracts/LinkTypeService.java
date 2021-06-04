package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.LinkType;

public interface LinkTypeService {
	DataResult<List<LinkType>> getAll();
	
	Result add(LinkType linkType);
}
