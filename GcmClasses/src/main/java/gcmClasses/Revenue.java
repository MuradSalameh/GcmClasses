package gcmClasses;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement

public class Revenue implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String revenueTitle;
	private String revenueDescription;
	private double amount;
	private LocalDate date;

	public Revenue() {
		super();
	}

	public Revenue(String revenueTitle, String revenueDescription, double amount, LocalDate date) {
		super();
		this.revenueTitle = revenueTitle;
		this.revenueDescription = revenueDescription;
		this.amount = amount;
		this.date = date;
	}

	@XmlElement(name = "RevenueTitle")
	public String getRevenueTitle() {
		return revenueTitle;
	}

	public void setRevenueTitle(String revenueTitle) {
		this.revenueTitle = revenueTitle;
	}

	@XmlElement(name = "ReveneueDescription")
	public String getRevenueDescription() {
		return revenueDescription;
	}

	public void setRevenueDescription(String revenueDescription) {
		this.revenueDescription = revenueDescription;
	}

	@XmlElement(name = "Amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	@XmlElement(name = "Date")
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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
		return "\nRevenue id=" + id + "\nrevenueTitle=" + revenueTitle + "\nrevenueDescription=" + revenueDescription
				+ "\namount=" + amount + "\ndate=" + date + "\n----------------------------------" + "\n";
	}

}
