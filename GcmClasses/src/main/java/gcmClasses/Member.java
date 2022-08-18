package gcmClasses;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "Member")
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

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
	Set<Game> games = new HashSet<>();
	Set<Event> events = new HashSet<>();
	private LocalDate birthday;
	Set<Team> teams = new HashSet<>();

	public Member() {
		super();
	}

	public Member(String clanName, String clanId, String realName, String address, String addressPostCode,
			String addressCity, String country, String email, String phoneNumber, List<Role> roles,
			List<Social> socials, Set<Game> games, Set<Event> events, LocalDate birthday, Set<Team> teams) {
		super();
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
		this.events = events;
		this.birthday = birthday;
		this.teams = teams;
	}

	@XmlElement(name = "ClanName")
	public String getClanName() {
		return clanName;
	}

	public void setClanName(String clanName) {
		this.clanName = clanName;
	}

	@XmlElement(name = "ClanID")
	public String getClanId() {
		return clanId;
	}

	public void setClanId(String clanId) {
		this.clanId = clanId;
	}

	@XmlElement(name = "RealName")
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@XmlElement(name = "Address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@XmlElement(name = "AddressPostCode")
	public String getAddressPostCode() {
		return addressPostCode;
	}

	public void setAddressPostCode(String addressPostCode) {
		this.addressPostCode = addressPostCode;
	}

	@XmlElement(name = "AddressCity")
	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	@XmlElement(name = "Country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@XmlElement(name = "Email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name = "PhoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@XmlTransient
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
		this.roles.clear();
		this.roles.addAll(roles);
	}

	@XmlTransient
	public List<Social> getSocials() {
		return socials;
	}

	public void setSocials(List<Social> socials) {
		this.socials = socials;
	}

	@XmlTransient
	public Set<Game> getGames() {
		return games;
	}

	public void setGames(Set<Game> games) {
		this.games = games;
	}

	@XmlTransient
	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	@XmlElement(name = "Birthday")
	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@XmlTransient
	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
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
		return "\nMember id = " + id + "\nclanName = " + clanName + "\nclanId = " + clanId + "\nrealName = " + realName
				+ "\naddress=" + address + "\naddressPostCode=" + addressPostCode + "\naddressCity=" + addressCity
				+ "\ncountry=" + country + "\nemail=" + email + "\nphoneNumber=" + phoneNumber + "\nbirthday="
				+ birthday + "\n----------------------------------" + "\n";
	}

}