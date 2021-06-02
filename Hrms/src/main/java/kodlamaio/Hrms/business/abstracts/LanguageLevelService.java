package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.LanguageLevel;

public interface LanguageLevelService {
	
	DataResult<List<LanguageLevel>> getAll();
	
	Result add(LanguageLevel languageLevel);
}
