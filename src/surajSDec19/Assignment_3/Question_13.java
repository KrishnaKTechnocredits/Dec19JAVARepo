package surajSDec19.Assignment_3;

import java.util.Scanner;

public class Question_13 {

	public void armstrong(int number) {
		int sum=0;
		int numCube=number;
		
		int remainder=0;
		while(numCube>0)
		{
			remainder=numCube%10;
			numCube=numCube/10;
			sum=sum+(remainder*remainder*remainder);
		}
		
		if(number==sum) {
			System.out.println(number+" is a armstrong number");
		}
		else {
			System.out.println(number+" is not a armstrong number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		Question_13 question_13 = new Question_13();
		question_13.armstrong(number);
		
		
	}

}
