package gcmClasses;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

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

	public int getId() {
		return id;
	}	
	
}
