package gcmClasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement()
public class Tournament {

	
	private int id;
	private String touramentTitle;
	private String tournamentDescription;
	private LocalDate tournamentDate;
	private LocalTime tournamentTimeBeginn;
	private LocalTime tournamentTimeEnd;
	List<Team> teams = new ArrayList<>();
    private Game game;
	private String tournamentResult;

	public Tournament() {
		super();
	}

	public Tournament(int id, String touramentTitle, String tournamentDescription, LocalDate tournamentDate,
			LocalTime tournamentTimeBeginn, LocalTime tournamentTimeEnd, List<Team> teams, Game game,
			String tournamentResult) {
		super();
		this.id = id;
		this.touramentTitle = touramentTitle;
		this.tournamentDescription = tournamentDescription;
		this.tournamentDate = tournamentDate;
		this.tournamentTimeBeginn = tournamentTimeBeginn;
		this.tournamentTimeEnd = tournamentTimeEnd;
		this.teams = teams;
		this.game = game;
		this.tournamentResult = tournamentResult;
	}



	public String getTouramentTitle() {
		return touramentTitle;
	}



	public void setTouramentTitle(String touramentTitle) {
		this.touramentTitle = touramentTitle;
	}



	public String getTournamentDescription() {
		return tournamentDescription;
	}



	public void setTournamentDescription(String tournamentDescription) {
		this.tournamentDescription = tournamentDescription;
	}


	@XmlJavaTypeAdapter(value= LocalDateAdapter.class) //Annotierungen immer beim Getter
	public LocalDate getTournamentDate() {
		return tournamentDate;
	}



	public void setTournamentDate(LocalDate tournamentDate) {
		this.tournamentDate = tournamentDate;
	}


	@XmlJavaTypeAdapter(value= LocalTimeAdapter.class) //Annotierungen immer beim Getter
	public LocalTime getTournamentTimeBeginn() {
		return tournamentTimeBeginn;
	}



	public void setTournamentTimeBeginn(LocalTime tournamentTimeBeginn) {
		this.tournamentTimeBeginn = tournamentTimeBeginn;
	}


	@XmlJavaTypeAdapter(value= LocalTimeAdapter.class) //Annotierungen immer beim Getter
	public LocalTime getTournamentTimeEnd() {
		return tournamentTimeEnd;
	}

	public void setTournamentTimeEnd(LocalTime tournamentTimeEnd) {
		this.tournamentTimeEnd = tournamentTimeEnd;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public String getTournamentResult() {
		return tournamentResult;
	}

	public void setTournamentResult(String tournamentResult) {
		this.tournamentResult = tournamentResult;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}