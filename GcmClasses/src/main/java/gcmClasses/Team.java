package gcmClasses;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class Team  implements Serializable{

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


	public Set<Member> getMembers() {
		return members;
	}


	public void setMembers(Set<Member> members) {
		this.members = members;
	}


	public int getId() {
		return id;
	}



}

