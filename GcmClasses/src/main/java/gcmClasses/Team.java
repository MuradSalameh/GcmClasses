package gcmClasses;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Team {
	
	private int id;
	private String teamName;
	private String teamDescription;
	List<Member> members = new ArrayList<>();

	
	public Team() {
		super();
	}


	public Team(int id, String teamName, String teamDescription, List<Member> members) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.teamDescription = teamDescription;
		this.members = members;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getTeamDescription() {
		return teamDescription;
	}


	public void setTeamDescription(String teamDescription) {
		this.teamDescription = teamDescription;
	}


	public List<Member> getMembers() {
		return members;
	}


	public void setMembers(List<Member> members) {
		this.members = members;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	

}

