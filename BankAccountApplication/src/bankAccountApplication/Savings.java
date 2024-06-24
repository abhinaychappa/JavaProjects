package bankAccountApplication;

public class Savings extends Account{
	//List properties specific to Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxPIN;
	
	//Constructors to initialize Savings account properties
	public Savings(String name,String socialSecurityNumber,double initialDeposit) {
		super(name,socialSecurityNumber,initialDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxPIN=(int)(Math.random()*Math.pow(10, 4));
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type : Savings");
		System.out.println("Safety Deposit Box ID : "+safetyDepositBoxID);
		System.out.println("Safety Deposit Box PIN : "+safetyDepositBoxPIN);
	}

	@Override
	public void setRate() {
		rate = getBaseRate()-0.25;
		
	}
		
	//List any methods specific to Savings account

}
