package gcmClasses;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;
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

	public String getExpenseTitle() {
		return expenseTitle;
	}

	public void setExpenseTitle(String expenseTitle) {
		this.expenseTitle = expenseTitle;
	}

	public String getExpenseDescription() {
		return expenseDescription;
	}

	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@XmlJavaTypeAdapter(value= LocalDateAdapter.class)
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public List<ExpenseType> getExpenseTypes() {
		return expenseTypes;
	}

	public void setExpenseTypes(List<ExpenseType> expenseTypes) {
		this.expenseTypes = expenseTypes;
	}

	public int getId() {
		return id;
	}
	
	
}
