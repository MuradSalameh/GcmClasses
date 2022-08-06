package gcmClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
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

	public String getGenreTitle() {
		return genreTitle;
	}

	public void setGenreTitle(String genreTitle) {
		this.genreTitle = genreTitle;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	public int getId() {
		return id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	

}
