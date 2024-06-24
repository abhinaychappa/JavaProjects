package bankAccountApplication;

public class Checking extends Account{
	//List properties specific to Checking account
	int debitCardNumber;
	int debitCardPIN;
	
	//Constructors to initialize Checking account properties
	public Checking(String name,String socialSecurityNumber,double initialDeposit) {
		super(name,socialSecurityNumber,initialDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
		
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type : Checking");
		System.out.println("Debit card number : "+debitCardNumber);
		System.out.println("Debit card PIN : "+debitCardPIN);
	}
	private void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPIN =(int)(Math.random()*Math.pow(10, 4));
		
	}

	@Override
	public void setRate() {
		rate = getBaseRate()*0.15;
		
	}
	
	//List any methods specific to Checking account

}
