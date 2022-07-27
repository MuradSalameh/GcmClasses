package gcmClasses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class RevenueType {

	private int id;
	private String revenueTypeTitle;
	private String revenueTypeDescription;

	public RevenueType() {
		super();
	}

	public RevenueType(String revenueTypeTitle, String revenueTypeDescription) {
		super();
		this.revenueTypeTitle = revenueTypeTitle;
		this.revenueTypeDescription = revenueTypeDescription;
	}

	public String getRevenueTypeTitle() {
		return revenueTypeTitle;
	}

	public void setRevenueTypeTitle(String revenueTypeTitle) {
		this.revenueTypeTitle = revenueTypeTitle;
	}

	public String getRevenueTypeDescription() {
		return revenueTypeDescription;
	}

	public void setRevenueTypeDescription(String revenueTypeDescription) {
		this.revenueTypeDescription = revenueTypeDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
