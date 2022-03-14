package badTranslatorMain.tables.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/lang")
public class LanguageController {
	
	@Autowired
	private LanguageRep languageRep;
	
	@GetMapping(path="/all")
	private Iterable<Language> allLanguages(){
		return languageRep.findAll();
	}

}
