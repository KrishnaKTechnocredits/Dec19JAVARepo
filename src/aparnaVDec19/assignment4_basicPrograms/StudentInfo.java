package aparnaVDec19.assignment4_basicPrograms;

/* 2.WAP to print the details of Student As Roll No Name and Marks by taking input from the user.
 */
import java.util.Scanner;

public class StudentInfo {

	public void displayStudentEnteredInfo(String studentName, int rollNumber, int studentMarks) {
		System.out.println("Entered Details of Student are:-> ");
		System.out.println("Student Name is:- " + studentName);
		System.out.println("Student Roll Number is:- " + rollNumber);
		System.out.println("Student Marks is:- " + studentMarks);
	}

	public static void main(String[] args) {
		StudentInfo studentinfo = new StudentInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Student:-> ");
		String StudentName = sc.nextLine();

		System.out.println("Enter the Roll No. of the Student:-> ");
		int rollNumber = Integer.parseInt(sc.nextLine());

		System.out.println("Enter the Marks of the Student:-> ");
		int studentMarks = Integer.parseInt(sc.nextLine());
		sc.close();
		studentinfo.displayStudentEnteredInfo(StudentName, rollNumber, studentMarks);

	}
}
