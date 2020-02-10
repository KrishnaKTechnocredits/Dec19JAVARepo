/* 9.	WAP to input student marks by condition:
Marks is greater than 0 and less than50--FAIILED
Marks is greater than 50 and less than 75--1st Class
Marks greater than 75 –and less than 100Distinction
 */

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

public class Solution9 {
	Solution9(int marks){
		findStudentsGrade(marks);
		
	}
	
	void findStudentsGrade(int marks)
	{
		if (marks>0 && marks <50)
			System.out.println("Student is FAILED");
		else if (marks >=50 && marks <75)
			System.out.println("Student is First Class");
		else if (marks >= 75 && marks<100)
			System.out.println("Student has passed with Distinction");
		else
			System.out.println("You have entered invalid marks, please enter marks between 1 to 100");
		
	}
	public static void main(String[] args) {
		Solution9 solution9 = new Solution9(50);
	}

}
