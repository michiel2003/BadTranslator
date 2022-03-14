package badTranslatorMain.tables.language.lang.dutch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dutch")
public class Dutch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wordId")
	private Integer wordId;
	
	@Column(name = "word")
	private String word;

	
	
//	getters and setters
	public Integer getWordId() {
		return wordId;
	}

	public void setWordId(Integer wordId) {
		this.wordId = wordId;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
}
