package gcmClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
@XmlRootElement
public class Partner implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	private int id;		

	private String companyName;
	
	private String contactPersonName;
	
	private String contactPersonPhone;
	
	private String contactPersonMail;

	private String firstName;

	private String lastName;	

	private String adressStreet;

	private String adressNumber;

	private String adressPostCode;

	private String adressCity;	

	private String country;	

	private String email;	

	private String phoneNumber;	

	List<Social> socials = new ArrayList<>();
	
	List<Revenue> revenues = new ArrayList<>();

	
	public Partner() {
		super();
	}


	public Partner(String companyName, String contactPersonName, String contactPersonPhone, String contactPersonMail,
			String firstName, String lastName, String adressStreet, String adressNumber, String adressPostCode,
			String adressCity, String country, String email, String phoneNumber, List<Social> socials,
			List<Revenue> revenues) {
		super();
		this.companyName = companyName;
		this.contactPersonName = contactPersonName;
		this.contactPersonPhone = contactPersonPhone;
		this.contactPersonMail = contactPersonMail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adressStreet = adressStreet;
		this.adressNumber = adressNumber;
		this.adressPostCode = adressPostCode;
		this.adressCity = adressCity;
		this.country = country;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.socials = socials;
		this.revenues = revenues;
	}

	@XmlElement(name="CompanyName")
	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@XmlElement(name="ContactPersonName")
	public String getContactPersonName() {
		return contactPersonName;
	}


	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	@XmlElement(name="ContactPersonPhone")
	public String getContactPersonPhone() {
		return contactPersonPhone;
	}


	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}

	@XmlElement(name="ContactPersonMail")
	public String getContactPersonMail() {
		return contactPersonMail;
	}


	public void setContactPersonMail(String contactPersonMail) {
		this.contactPersonMail = contactPersonMail;
	}

	@XmlElement(name="FirstName")
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElement(name="LastName")
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlElement(name="AddressStreet")
	public String getAdressStreet() {
		return adressStreet;
	}


	public void setAdressStreet(String adressStreet) {
		this.adressStreet = adressStreet;
	}

	@XmlElement(name="AddressNumber")
	public String getAdressNumber() {
		return adressNumber;
	}


	public void setAdressNumber(String adressNumber) {
		this.adressNumber = adressNumber;
	}

	@XmlElement(name="AddressPostCode")
	public String getAdressPostCode() {
		return adressPostCode;
	}


	public void setAdressPostCode(String adressPostCode) {
		this.adressPostCode = adressPostCode;
	}

	@XmlElement(name="AddressCity")
	public String getAdressCity() {
		return adressCity;
	}


	public void setAdressCity(String adressCity) {
		this.adressCity = adressCity;
	}

	@XmlElement(name="Country")
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	@XmlElement(name="Email")
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name="PhoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@XmlTransient
	public List<Social> getSocials() {
		return socials;
	}


	public void setSocials(List<Social> socials) {
		this.socials = socials;
	}

	@XmlTransient
	public List<Revenue> getRevenues() {
		return revenues;
	}

	
	public void setRevenues(List<Revenue> revenues) {
		this.revenues = revenues;
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
		return "\nPartner id=" + id 
				+ "\ncompanyName=" + companyName 
				+ "\ncontactPersonName=" + contactPersonName
				+ "\ncontactPersonPhone=" + contactPersonPhone 
				+ "\ncontactPersonMail=" + contactPersonMail
				+ "\nfirstName=" + firstName 
				+ "\nlastName=" + lastName 
				+ "\nadressStreet=" + adressStreet
				+ "\nadressNumber=" + adressNumber 
				+ "\nadressPostCode=" + adressPostCode 
				+ "\nadressCity=" + adressCity
				+ "\ncountry=" + country 
				+ "\nemail=" + email 
				+ "\nphoneNumber=" + phoneNumber;
	}	
	
	

}
