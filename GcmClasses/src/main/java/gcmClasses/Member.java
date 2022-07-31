package gcmClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement()
public class Member {	
	private int id;			
	private String clanName;	
	private String clanId;		
	private String realName;	
	private String address;
	private String addressPostCode;
	private String addressCity;	
	private String country;	
	private String email;	
	private String phoneNumber;	
	List<Role> roles = new ArrayList<>();	
	List<Social> socials = new ArrayList<>();	
	List<Game> games = new ArrayList<>();	
	private LocalDate birthday;	
	List<Team> teams = new ArrayList<>();
	List<Event> events = new ArrayList<>();

	public Member() {
		super();
	}

	public Member(int id, String clanName, String clanId, String realName, String address, String addressPostCode,
			String addressCity, String country, String email, String phoneNumber, List<Role> roles,
			List<Social> socials, List<Game> games, LocalDate birthday, List<Team> teams, List<Event> events) {
		super();
		this.id = id;
		this.clanName = clanName;
		this.clanId = clanId;
		this.realName = realName;
		this.address = address;
		this.addressPostCode = addressPostCode;
		this.addressCity = addressCity;
		this.country = country;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.roles = roles;
		this.socials = socials;
		this.games = games;
		this.birthday = birthday;
		this.teams = teams;
		this.events = events;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClanName() {
		return clanName;
	}

	public void setClanName(String clanName) {
		this.clanName = clanName;
	}

	public String getClanId() {
		return clanId;
	}

	public void setClanId(String clanId) {
		this.clanId = clanId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressPostCode() {
		return addressPostCode;
	}

	public void setAddressPostCode(String addressPostCode) {
		this.addressPostCode = addressPostCode;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Social> getSocials() {
		return socials;
	}

	public void setSocials(List<Social> socials) {
		this.socials = socials;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	@XmlJavaTypeAdapter(value= LocalDateAdapter.class) //Annotierungen immer beim Getter
	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	

}