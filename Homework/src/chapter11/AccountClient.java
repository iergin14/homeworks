package chapter11;

public class AccountClient {
	
	private String name;
	private String surname;
	private Account account;

	public AccountClient(String name, String surname, Account account) {
		this.name=name;
		this.surname=surname;
		this.account=account;
		
	}
	
	public String getName () {
		return name;
	}
	
	public String getSurname ( ) {
		return surname;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setName (String newName) {
		name=newName;
	}
	
	public void setSurname (String newSurname ) {
		surname=newSurname;
	}
	
	public void setAccount(Account newAccount) {
		account=newAccount;
	}
	
	public void withdraw(Double money) {
		Double beginingMoney = account.getAccount();
		Double currentMoney= beginingMoney-money;
		account.setAccount(currentMoney);	
	}
	
	public void deposit(Double money) {
		Double beginingMoney = account.getAccount();
		Double currentMoney= beginingMoney+money;
		account.setAccount(currentMoney);		
	}
	
	public void transfer(Account newAccount,Double money, Double transferPrice) {
		
		Double beginingMoney = account.getAccount();
		Double currentMoney= beginingMoney - money - transferPrice;
		account.setAccount(currentMoney);
		
		Double initialMoney = newAccount.getAccount();
		Double currentMoney2= initialMoney+money;
		newAccount.setAccount(currentMoney2);	
		
		
	}
	
	public Double getCurrentMoney() {
		double money = account.getAccount();
		return money;
	}
}
