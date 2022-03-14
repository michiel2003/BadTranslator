package badTranslatorMain.tables.language.lang.dutch.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badTranslatorMain.tables.language.lang.dutch.Dutch;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/lang/dutch")
public class DutchController {
	
	@Autowired
	private DutchRep dutchRep;
	
	@GetMapping(path = "/all")
	private Iterable<Dutch> allDutchWords(){
		return dutchRep.findAll();
	}

}
