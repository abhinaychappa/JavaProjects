package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email obj=new Email("Abhinay","Chappa");
		//calling get, set methods of alternate email
		obj.setAlternateEmail("achappa@gmail.com");
		System.out.println("Alternate Email : "+obj.getAlternateEmail());
		
		//calling get,set methods for changing password.
		obj.setNewPassword("abhinaychappa123");
		System.out.println("New password : "+obj.getNewPassword());
		
		//calling get,set methods of mailbox Capacity
		obj.setMailCapacity(550);
		System.out.println("Mailbox Capacity : "+obj.getMailCapacity());
	}

}
