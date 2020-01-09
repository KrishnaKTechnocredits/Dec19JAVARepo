package prasadSDec2019.Assignment1;
import java.util.Scanner;

public class Question5 {
	void integerBetweenTwoInteger() {
		int i;
		int num1;
		int num2;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting integer");
		num1=scn.nextInt();
		System.out.println("Enter last integer");
		num2=scn.nextInt();
		System.out.print("Numbers are:");
		for(i=num1;num1<=num2;i++) {
			num1++;
			System.out.print(i);
		}
		
	}
	
	public static void main(String[] args) {
		Question5 q5=new Question5();
		q5.integerBetweenTwoInteger();
	}
}
