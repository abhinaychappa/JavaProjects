package bankAccountApplication;

public abstract class Account implements IBaseRate {
	//List common properties for checking and savings account
	String name;
	String socialSecurityNumber;
	double initialDeposit;
	double rate;
	String accountNumber;
	static int index =10000;
	
	//Constructors to set base properties and initialize the account
	public Account(String name,String socialSecurityNumber,double initialDeposit) {
		this.name=name;
		this.socialSecurityNumber=socialSecurityNumber;
		this.initialDeposit=initialDeposit;
		
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
	}
	//Creating Account number as per required specifications
	public String setAccountNumber() {
		String lastTwoOfSSN = socialSecurityNumber.substring(socialSecurityNumber.length()-2,socialSecurityNumber.length());
		int uniqueID=index;
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	public abstract void setRate();
	//List common methods
	public void deposit(double amount) {
		initialDeposit = initialDeposit+amount;
		System.out.println("Deposited amount : Rs."+amount);
		printBalance();
	}
	public void withdraw(double amount) {
		initialDeposit = initialDeposit-amount;
		System.out.println("Withdrawn amount : Rs."+amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		initialDeposit = initialDeposit-amount;
		System.out.println("Transferring Rs."+amount+" to "+toWhere)	;
		printBalance();
		}
	public void printBalance() {
		System.out.println("Total Balance : Rs."+initialDeposit);
		System.out.println("");
	}
	public void compoundInterest() {
		double accruedInterest=initialDeposit*(rate/100);
		initialDeposit = initialDeposit*accruedInterest;
		System.out.println("Accrued Interest : Rs."+accruedInterest);
		printBalance();
	}
	public void showInfo() {
		System.out.print("Name : "+name+"\n"+
	            "Account Number : "+accountNumber+"\n"+
				"Initial Deposit : "+initialDeposit+"\n"+
	            "Interest rate is : "+rate+"%\n");
		
		
		
		
	}

}
