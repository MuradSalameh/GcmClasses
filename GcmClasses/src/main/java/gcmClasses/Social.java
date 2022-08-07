package gcmClasses;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class Social  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String socialPlatform;	
	
	private String socialUsername;	
	
	private String socialLink;	
	
	private String socialNotes;
	
	public Social() {
		super();
	}

	public Social(String socialPlatform, String socialUsername, String socialLink, String socialNotes) {
		super();
		this.socialPlatform = socialPlatform;
		this.socialUsername = socialUsername;
		this.socialLink = socialLink;
		this.socialNotes = socialNotes;
	}

	@XmlElement(name="SocialPlatform")
	public String getSocialPlatform() {
		return socialPlatform;
	}

	public void setSocialPlatform(String socialPlatform) {
		this.socialPlatform = socialPlatform;
	}

	@XmlElement(name="SocialUsername")
	public String getSocialUsername() {
		return socialUsername;
	}

	public void setSocialUsername(String socialUsername) {
		this.socialUsername = socialUsername;
	}

	@XmlElement(name="SocialLink")
	public String getSocialLink() {
		return socialLink;
	}

	public void setSocialLink(String socialLink) {
		this.socialLink = socialLink;
	}

	@XmlElement(name="SocialNotes")
	public String getSocialNotes() {
		return socialNotes;
	}

	public void setSocialNotes(String socialNotes) {
		this.socialNotes = socialNotes;
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
		return "\nSocial [id=" + id 
				+ "\nsocialPlatform=" + socialPlatform 
				+ "\nsocialUsername=" + socialUsername
				+ "\nsocialLink=" + socialLink 
				+ "\nsocialNotes=" + socialNotes 
				+ "\n----------------------------------"
				+ "\n";
				
	}
	
	

}

