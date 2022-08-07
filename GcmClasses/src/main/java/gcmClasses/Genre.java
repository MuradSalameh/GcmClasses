package gcmClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlElement;
@XmlRootElement

public class Genre  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String genreTitle;	

    List<Game> games = new ArrayList<>();

	
	public Genre() {
		super();
	}

	public Genre(String genreTitle, List<Game> games) {
		super();
		this.genreTitle = genreTitle;
		this.games = games;
	}

	@XmlElement(name="GenreTitle")
	public String getGenreTitle() {
		return genreTitle;
	}

	public void setGenreTitle(String genreTitle) {
		this.genreTitle = genreTitle;
	}

	@XmlTransient
	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	@XmlElement(name="ID",required=true)
	public int getId() {
		return id;
	}
	
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\nGenre id=" + id 
				+ "\ngenreTitle=" + genreTitle
				+ "\n----------------------------------"
				+ "\n";
	}

	
	

}
