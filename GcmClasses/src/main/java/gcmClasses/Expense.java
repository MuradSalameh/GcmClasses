package gcmClasses;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlRootElement
public class Expense  implements Serializable{
	
	private static final long serialVersionUID = 1L;


	private int id;
	
	private String expenseTitle;
	
	private String expenseDescription;
	
	private double amount;
	
	private LocalDate date;
	
	private String recipientName;
	

	List<ExpenseType> expenseTypes = new ArrayList<>();

	public Expense() {
		super();
	}

	public Expense(String expenseTitle, String expenseDescription, double amount, LocalDate date, String recipientName,
			List<ExpenseType> expenseTypes) {
		super();
		this.expenseTitle = expenseTitle;
		this.expenseDescription = expenseDescription;
		this.amount = amount;
		this.date = date;
		this.recipientName = recipientName;
		this.expenseTypes = expenseTypes;
	}

	@XmlElement(name="ExpenseTitle")
	public String getExpenseTitle() {
		return expenseTitle;
	}

	public void setExpenseTitle(String expenseTitle) {
		this.expenseTitle = expenseTitle;
	}

	@XmlElement(name="ExpenseDescription")
	public String getExpenseDescription() {
		return expenseDescription;
	}

	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}

	@XmlElement(name="Amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@XmlJavaTypeAdapter(value= LocalDateAdapter.class)
	@XmlElement(name="Date")
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@XmlElement(name="RecipientName")
	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	@XmlTransient
	public List<ExpenseType> getExpenseTypes() {
		return expenseTypes;
	}

	
	public void setExpenseTypes(List<ExpenseType> expenseTypes) {
		this.expenseTypes = expenseTypes;
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
		return "\nExpense id=" + id 
				+ "\nexpenseTitle=" + expenseTitle 
				+ "\nexpenseDescription=" + expenseDescription
				+ "\namount=" + amount 
				+ "\ndate=" + date 
				+ "\nrecipientName=" + recipientName
				+ "\n----------------------------------"
				+ "\n";
	}
	
	
	
}
