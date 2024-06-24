package bankAccountApplication;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking checkobj1= new Checking("Abhinay","123456789",1500);
		Savings saveobj1= new Savings("Chappa","987654321",2500);

		saveobj1.showInfo();
		saveobj1.deposit(2500);
		saveobj1.withdraw(200);
		saveobj1.transfer("Brokerage", 2000);
		saveobj1.compoundInterest();
		System.out.println("====================================");
		checkobj1.showInfo();
		checkobj1.deposit(2500);
		checkobj1.withdraw(200);
		checkobj1.transfer("Brokerage", 2000);
		checkobj1.compoundInterest();
	}

}
