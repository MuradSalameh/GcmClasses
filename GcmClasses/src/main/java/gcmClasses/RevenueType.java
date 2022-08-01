package gcmClasses;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement()
public class RevenueType {

	private int id;
	private String revenueTypeTitle;
	private String revenueTypeDescription;
	List<Revenue> revenues = new ArrayList<>();

	public RevenueType() {
		super();
	}

	public RevenueType(int id, String revenueTypeTitle, String revenueTypeDescription, List<Revenue> revenues) {
		super();
		this.id = id;
		this.revenueTypeTitle = revenueTypeTitle;
		this.revenueTypeDescription = revenueTypeDescription;
		this.revenues = revenues;
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

	public List<Revenue> getRevenues() {
		return revenues;
	}

	public void setRevenues(List<Revenue> revenues) {
		this.revenues = revenues;
	}
	
	
	
}
