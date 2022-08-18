package chapter11;

public class Account {
	
	private Double balance;

	public Account(Double newBalance) {
		balance =newBalance;
	}
	
	public Double getAccount() {
		return balance;
	}
	public void setAccount(Double money) {
		balance= money;
	}
}
