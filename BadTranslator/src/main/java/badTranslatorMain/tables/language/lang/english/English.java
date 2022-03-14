package badTranslatorMain.tables.language.lang.english;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "English")
public class English {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
