package gcmClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class RevenueType  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	private int id;
	
	private String revenueTypeTitle;
	
	private String revenueTypeDescription;
	
		List<Revenue> revenues = new ArrayList<>();

	public RevenueType() {
		super();
	}

	public RevenueType(String revenueTypeTitle, String revenueTypeDescription, List<Revenue> revenues) {
		super();
		this.revenueTypeTitle = revenueTypeTitle;
		this.revenueTypeDescription = revenueTypeDescription;
		this.revenues = revenues;
	}

	@XmlElement(name="RevenueTypeTitle")
	public String getRevenueTypeTitle() {
		return revenueTypeTitle;
	}

	public void setRevenueTypeTitle(String revenueTypeTitle) {
		this.revenueTypeTitle = revenueTypeTitle;
	}

	@XmlElement(name="RevenueTypeDescription")
	public String getRevenueTypeDescription() {
		return revenueTypeDescription;
	}

	public void setRevenueTypeDescription(String revenueTypeDescription) {
		this.revenueTypeDescription = revenueTypeDescription;
	}

	public List<Revenue> getRevenues() {
		return revenues;
	}
	
	@XmlTransient
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
		return "\nRevenueType id=" + id 
				+ "\nrevenueTypeTitle=" + revenueTypeTitle 
				+ "\nrevenueTypeDescription=" + revenueTypeDescription
				+ "\n----------------------------------"
				+ "\n";
	}

	
	
}
