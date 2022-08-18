package chapter11;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(12000.5);
		AccountClient client = new AccountClient("Ilayda", "Ergin",account);
		System.out.println("Ilayda's start money : " + client.getCurrentMoney());
		client.deposit(125.50);
		Double currentMoney = client.getCurrentMoney();
		System.out.println("Ilayda's currentMoney: " + currentMoney);
		
		Account account2 = new Account(120.0);
		AccountClient client2 = new AccountClient("Ozge", "Ergin",account2);
		
		System.out.println("Ozge's start money: " + client2.getCurrentMoney());
		client.transfer(account2, 10000.0, 1.5);
		System.out.println("After transfer Ilayda's money: " + client.getCurrentMoney());
		System.out.println("After transfer Ozge's money: " + client2.getCurrentMoney());
	}

}
