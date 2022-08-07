package gcmClasses;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlRootElement

public class Tournament  implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private int id;

	private String touramentTitle;

	private String tournamentDescription;

	private LocalDate tournamentDate;

	private LocalTime tournamentTimeBeginn;

	private LocalTime tournamentTimeEnd;


	Set<Team> teams = new HashSet<>();



	
	
    private Game game;
    

	private String tournamentResult;

	/*
	@PreRemove
	public void checkAssociationBeforeRemoval() {
		if(!this.teams.isEmpty()) {
			throw new RuntimeException("Can't remove Tournament that has teams");
		}
	}
*/

	public Tournament() {
		super();
	}



	public Tournament(String touramentTitle, String tournamentDescription, LocalDate tournamentDate,
			LocalTime tournamentTimeBeginn, LocalTime tournamentTimeEnd, Set<Team> teams,Game game,
			String tournamentResult) {
		super();
		this.touramentTitle = touramentTitle;
		this.tournamentDescription = tournamentDescription;
		this.tournamentDate = tournamentDate;
		this.tournamentTimeBeginn = tournamentTimeBeginn;
		this.tournamentTimeEnd = tournamentTimeEnd;
		this.teams = teams;
		this.game = game;
		this.tournamentResult = tournamentResult;
	}


	@XmlElement(name="TournamentTitle")
	public String getTouramentTitle() {
		return touramentTitle;
	}



	public void setTouramentTitle(String touramentTitle) {
		this.touramentTitle = touramentTitle;
	}


	@XmlElement(name="TournamentDescription")
	public String getTournamentDescription() {
		return tournamentDescription;
	}



	public void setTournamentDescription(String tournamentDescription) {
		this.tournamentDescription = tournamentDescription;
	}


	@XmlJavaTypeAdapter(value= LocalDateAdapter.class)
	@XmlElement(name="TournamentDate")
	public LocalDate getTournamentDate() {
		return tournamentDate;
	}



	public void setTournamentDate(LocalDate tournamentDate) {
		this.tournamentDate = tournamentDate;
	}


	@XmlJavaTypeAdapter(value= LocalTimeAdapter.class)
	@XmlElement(name="TournamentTimeBeginn")
	public LocalTime getTournamentTimeBeginn() {
		return tournamentTimeBeginn;
	}



	public void setTournamentTimeBeginn(LocalTime tournamentTimeBeginn) {
		this.tournamentTimeBeginn = tournamentTimeBeginn;
	}


	@XmlJavaTypeAdapter(value= LocalTimeAdapter.class)
	@XmlElement(name="TournamentTimeEnd")
	public LocalTime getTournamentTimeEnd() {
		return tournamentTimeEnd;
	}



	public void setTournamentTimeEnd(LocalTime tournamentTimeEnd) {
		this.tournamentTimeEnd = tournamentTimeEnd;
	}



	public Set<Team> getTeams() {
		return teams;
	}



	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}


	@XmlElement(name="Game")
	public Game getGame() {
		return game;
	}



	public void setGame(Game game) {
		this.game = game;
	}


	@XmlElement(name="TournamentResult")
	public String getTournamentResult() {
		return tournamentResult;
	}



	public void setTournamentResult(String tournamentResult) {
		this.tournamentResult = tournamentResult;
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
		return "\nTournament [id=" + id 
				+ "\ntouramentTitle=" + touramentTitle 
				+ "\ntournamentDescription="+ tournamentDescription 
				+ "\ntournamentDate=" + tournamentDate 
				+ "\ntournamentTimeBeginn="	+ tournamentTimeBeginn 
				+ "\ntournamentTimeEnd=" + tournamentTimeEnd 
				+ "\ngame=" + game
				+ "\ntournamentResult=" + tournamentResult 
				+ "\n----------------------------------"
				+ "\n";
	}



}