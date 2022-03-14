package badTranslatorMain.tables.language;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRep extends CrudRepository<Language, Integer>{
	

}
