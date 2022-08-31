package gcmClasses;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;



@XmlRootElement

public class Team implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String teamName;
	private String teamDescription;
	private Set<Member> members = new HashSet<>();

	public Team() {
		super();
	}

	public Team(String teamName, String teamDescription, Set<Member> members) {
		super();
		this.teamName = teamName;
		this.teamDescription = teamDescription;
		this.members = members;
	}

	@XmlElement(name = "Teamname")
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@XmlElement(name = "TeamDescription")
	public String getTeamDescription() {
		return teamDescription;
	}

	public void setTeamDescription(String teamDescription) {
		this.teamDescription = teamDescription;
	}

	@XmlTransient
	public Set<Member> getMembers() {
		return members;
	}

	public void setMembers(Set<Member> members) {
		this.members = members;
	}

	@XmlElement(name = "ID", required = true)
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
		return "\nTeam [id=" + id + "\nteamName=" + teamName + "\nteamDescription=" + teamDescription
				+ "\n----------------------------------" + "\n";
	}

}
