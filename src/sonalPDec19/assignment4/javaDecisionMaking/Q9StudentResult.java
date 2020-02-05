package sonalPDec19.assignment4.javaDecisionMaking;

/*
 * 	WAP to input student marks by condition:
	Marks is greater than 0 and less than 50--FAIILED
	Marks is greater than 50 and less than 75--1st Class
	Marks greater than 75 –and less than 100Distinction
 */
import java.util.Scanner;

public class Q9StudentResult {

	static void printStudentResult(int mark) {
		if (mark >= 0 && mark <= 50)
			System.out.println("Student is failed.");
		else if (mark > 50 && mark <= 75)
			System.out.println("Student is passed with first class.");
		else if (mark > 75)
			System.out.println("student is passed with distinction.");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks of student: ");
		int mark = s.nextInt();
		printStudentResult(mark);
	}
}
