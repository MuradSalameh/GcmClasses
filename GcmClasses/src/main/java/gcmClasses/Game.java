package gcmClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlRootElement()
public class Game {

	
	private int id;
	private String gameTitle;
	private LocalDate releaseDate;
	List<Genre> genres = new ArrayList<Genre>();
	List<Member> members = new ArrayList<Member>();
    List<Tournament> tournaments = new ArrayList<Tournament>();
	private String gameAdditionalNotes;

	public Game() {
		super();
	}

	public Game(int id, String gameTitle, LocalDate releaseDate, List<Genre> genres, List<Member> members,
			List<Tournament> tournaments, String gameAdditionalNotes) {
		super();
		this.id = id;
		this.gameTitle = gameTitle;
		this.releaseDate = releaseDate;
		this.genres = genres;
		this.members = members;
		this.tournaments = tournaments;
		this.gameAdditionalNotes = gameAdditionalNotes;
	}

	public String getGameTitle() {
		return gameTitle;
	}



	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}


	@XmlJavaTypeAdapter(value= LocalDateAdapter.class) //Annotierungen immer beim Getter
	public LocalDate getReleaseDate() {
		return releaseDate;
	}



	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}



	public List<Genre> getGenres() {
		return genres;
	}



	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}



	public List<Member> getMembers() {
		return members;
	}



	public void setMembers(List<Member> members) {
		this.members = members;
	}



	public List<Tournament> getTournaments() {
		return tournaments;
	}



	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}



	public String getGameAdditionalNotes() {
		return gameAdditionalNotes;
	}



	public void setGameAdditionalNotes(String gameAdditionalNotes) {
		this.gameAdditionalNotes = gameAdditionalNotes;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}
