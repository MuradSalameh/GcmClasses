package gcmClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement()
public class Member {	
	private int id;		
	private String firstName;	
	private String lastName;	
	private String addressStreet;	
	private String addressNumber;
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


	public Member() {
		super();
	}


	public Member(String firstName, String lastName, String addressStreet, String addressNumber, String addressPostCode,
			String addressCity, String country, String email, String phoneNumber, List<Role> roles, List<Social> socials,
			List<Game> games, LocalDate birthday, List<Team> teams) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressStreet = addressStreet;
		this.addressNumber = addressNumber;
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
	}


	public String getFirstName() {
		return firstName;
	}

	// Annotierungen der Getter sind default schon gesetzt und müssen nicht mehr nachgetragen werden.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddressStreet() {
		return addressStreet;
	}


	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}


	public String getAddressNumber() {
		return addressNumber;
	}


	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
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


	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", addressStreet="
				+ addressStreet + ", addressNumber=" + addressNumber + ", addressPostCode=" + addressPostCode
				+ ", addressCity=" + addressCity + ", country=" + country + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", birthday=" + birthday + "]";
	}


	
	



}