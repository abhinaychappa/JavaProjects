package studentDatabaseApplication;

import java.util.Scanner;

public class Student {
	private String Q ;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String gradeName;
	private String studentID;
	private static int id=1000;
	private int numberOfStudents;
	private String courses=" ";
	private static int tutionBalance=0;
	private int costOfCourse=600;
	private static int i;
	
	
	public Student() {
		System.out.print("Number of students user want to enroll : ");
		Scanner sc = new Scanner(System.in);
		this.numberOfStudents=sc.nextInt();
		if(numberOfStudents<=0) {
			System.out.println("Invalid");
		}
		else {
		for(int a=1;a<=numberOfStudents;a++) {
		
		
	    Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter First name : ");
		this.firstName=sc1.nextLine();
		
		System.out.print("Enter Last name : ");
		this.lastName=sc1.nextLine();
		
		System.out.print("1-6 : Primary\n7-10 : Secondary\n11-12 : Higher\n");
		System.out.print("Enter Grade Year : ");
		this.gradeYear=sc1.nextInt();
		this.gradeName=getGradeName();
		System.out.println("Display Name : "+firstName+" "+lastName);
		System.out.println("Grade Year : "+gradeYear);
		System.out.println("Grade Name : "+gradeName);
		
		setStudentID();
		System.out.println("Student ID : "+studentID);
		
		enroll();
		payTution();
		System.out.println("**********************");
		}
		}
	}
	
	public String getGradeName() {
		if(gradeYear>0&&gradeYear<7) {
			this.gradeName="Primary";
		}
		else if(gradeYear>6&&gradeYear<11) {
			this.gradeName="Secondary";
		}
		else if(gradeYear>10&&gradeYear<13) {
			this.gradeName="Higher";
		}
		else {
			this.gradeName="Invalid ";
		}
		return gradeName;
		
	}
	
	public void setStudentID() {
		id++;
		this.studentID= gradeYear+""+id;	
	}
	public void enroll() {
		System.out.print("Available Courses : \nHistory 101\nMathematics 101\nEnglish 101\nComputer Science 101\nChemistry 101\n");
		do {
			
			System.out.print("Enter course to Enroll(Q to quit) :");
			Scanner in = new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")) {
			if(course.equals("History 101")||course.equals("Mathematics 101")||course.equals("English 101")||course.equals("Computer Science 101")||course.equals("Chemistry 101")) {
					courses =courses+"\n"+course;
					tutionBalance=tutionBalance+costOfCourse;
				}	
			
			else if(!course.equals("History 101")||!course.equals("Mathematics 101")||!course.equals("English 101")||!course.equals("Computer Science 101")||!course.equals("Chemistry 101")){
				courses=courses+"\n"+"Invalid courses";
			}
		}
			else {
				break;
			}
			
		}while(1!=0);
		System.out.print("Enrolled Courses : "+courses+"\n");
		System.out.println("Tution Balance : "+tutionBalance);
	}
	public void viewBalance() {
		System.out.println("Your balance is Rs."+tutionBalance);
	}
	
	public void payTution() {
		System.out.print("Enter your payment Rs.");
		Scanner sc=new Scanner(System.in);
		int payment=sc.nextInt();
		tutionBalance=tutionBalance-payment;
		System.out.println("Thank you for your payment of Rs."+payment);
		viewBalance();
	}

}
