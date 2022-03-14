package badTranslatorMain.tables.language.lang.english.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badTranslatorMain.tables.language.lang.english.English;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/lang/english")
public class EnglishController {
	
	@Autowired
	private EnglishRep englishRep;
	
	@GetMapping(path = "/all")
	private Iterable<English> allEnglishWords(){
		return englishRep.findAll();
	}

}
