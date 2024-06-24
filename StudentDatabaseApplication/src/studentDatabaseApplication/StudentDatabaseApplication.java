package studentDatabaseApplication;

import java.util.Scanner;

public class StudentDatabaseApplication {

	public static void main(String[] args) {
		System.out.print("Enter no.of users : ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();	
		Student[] users=new Student[n];
		
		for(int a=0;a<users.length;a++) {
			users[a]=new Student();
			System.out.println("====================================================================");
		}
		
		
		
        
	}

}
