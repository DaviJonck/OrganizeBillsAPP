package entities;

import java.time.LocalDate;

public class Contas {
	private String accountName;
	private Double totalAccount;
	private LocalDate dueDate;
	
	
	public Contas(String accountName, Double totalAccount, LocalDate dueDate) {
		super();
		this.accountName = accountName;
		this.totalAccount = totalAccount;
		this.dueDate = dueDate;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getTotalAccount() {
		return totalAccount;
	}
	public void setTotalAccount(Double totalAccount) {
		this.totalAccount = totalAccount;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
	
	
	
	
	
	
	
	
		
}
