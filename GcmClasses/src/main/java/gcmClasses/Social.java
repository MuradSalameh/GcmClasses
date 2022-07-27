package gcmClasses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Social {	
	
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

	public String getSocialPlatform() {
		return socialPlatform;
	}

	public void setSocialPlatform(String socialPlatform) {
		this.socialPlatform = socialPlatform;
	}

	public String getSocialUsername() {
		return socialUsername;
	}

	public void setSocialUsername(String socialUsername) {
		this.socialUsername = socialUsername;
	}

	public String getSocialLink() {
		return socialLink;
	}

	public void setSocialLink(String socialLink) {
		this.socialLink = socialLink;
	}

	public String getSocialNotes() {
		return socialNotes;
	}

	public void setSocialNotes(String socialNotes) {
		this.socialNotes = socialNotes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}

