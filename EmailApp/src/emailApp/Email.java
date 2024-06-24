package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String companySuffix="aicompany.com";
	private String email;
	private int deptChoice;
	private int mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength=7;
	
	//Create constructor to receive the first name and last name.
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Display Name : "+this.firstName+" "+this.lastName);
		
		
		// call the department method
		this.department=setDepartment();
		System.out.println("Department : "+this.department);
		//call the random password generation method 
		if(deptChoice>0&&deptChoice<4) {
			this.password=setRandomPassword();
			System.out.println("Generated password : "+password);	
			//combine all elements to generate email
			email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
			System.out.println("Email ID : "+email);
		}
		else {
			System.out.println("Cannot generate password and email due to entry of wrong department code");
		}
		
		
	}
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES :\n 1 is for sales\n 2 is for development\n 3 is for marketing\nEnter Department code :");
		Scanner sc=new Scanner(System.in);
		deptChoice=sc.nextInt();
		if(deptChoice==1) {
			return "sales";
		}
		if(deptChoice==2) {
			return "dev";
		}
		if(deptChoice==3) {
			return "marketing";
		}
		else {
			return "Please enter valid department code.";
		}
		
	}
	
	private String setRandomPassword() {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*abcdefghijklmnopqrstuvwxyz";
		char[] password=new char[defaultPasswordLength];
		for(int i=0;i<password.length;i++) {
		//The java.lang.Math.random() method returns a pseudorandom double type number greater than or equal to 0.0 and less than 1.0. 
		int random=(int)(Math.random()*passwordSet.length());
		//here this generates some random integers whose value is less then the length of the passwordSet
		password[i]=passwordSet.charAt(random);
		}
		return new String(password);
	}
	//create set and get methods for alternate email
	public void setAlternateEmail(String alternateEmail) {
		if(deptChoice>0&&deptChoice<4) {
			this.alternateEmail=alternateEmail;
		}
		else {
			this.alternateEmail="Cannot be generated ";
		}
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	//create set and get methods for changing password
	public void setNewPassword(String password) {
		if(deptChoice>0&&deptChoice<4) {
			this.password=password;
		}
		else {
			this.password="There was no generated password to change , please check the department code";
		}
	}
	public String getNewPassword() {
		return password;
	}
	
	//create get and set methods for mail capacity
	public void setMailCapacity(int mailboxCapacity) {
			this.mailboxCapacity=mailboxCapacity;
	}
	public int getMailCapacity() {
		return mailboxCapacity;
	}
}
