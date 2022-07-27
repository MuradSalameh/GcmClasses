package gcmClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement()
public class Revenue {
	
	private int id;
	private String revenueTitle;
	private String revenueDescription;
	private double amount;
	private LocalDate date;
	private Partner partner;
	List<RevenueType> revenueTypes = new ArrayList<>();

	public Revenue() {
		super();
	}

	public Revenue(String revenueTitle, String revenueDescription, double amount, LocalDate date, Partner partner,
			List<RevenueType> revenueTypes) {
		super();
		this.revenueTitle = revenueTitle;
		this.revenueDescription = revenueDescription;
		this.amount = amount;
		this.date = date;
		this.partner = partner;
		this.revenueTypes = revenueTypes;
	}

	public String getRevenueTitle() {
		return revenueTitle;
	}

	public void setRevenueTitle(String revenueTitle) {
		this.revenueTitle = revenueTitle;
	}

	public String getRevenueDescription() {
		return revenueDescription;
	}

	public void setRevenueDescription(String revenueDescription) {
		this.revenueDescription = revenueDescription;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@XmlJavaTypeAdapter(value= LocalDateAdapter.class) //Annotierungen immer beim Getter
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	public List<RevenueType> getRevenueTypes() {
		return revenueTypes;
	}

	public void setRevenueTypes(List<RevenueType> revenueTypes) {
		this.revenueTypes = revenueTypes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
