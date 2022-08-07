package gcmClasses;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ExpenseType  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String expenseTitle;
	
	private String expenseDescription;	
	

	public ExpenseType() {
		super();
	}


	public ExpenseType(String expenseTitle, String expenseDescription) {
		super();
		this.expenseTitle = expenseTitle;
		this.expenseDescription = expenseDescription;
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
		return "\nExpenseType id=" + id 
				+ "\nexpenseTitle=" + expenseTitle 
				+ "\nexpenseDescription=" + expenseDescription
				+ "\n----------------------------------"
				+ "\n";
				
	}
	
	
	
	
	
}
