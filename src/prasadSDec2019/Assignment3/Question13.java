package prasadSDec2019.Assignment3;
//WAP to find number is Armstrong or not.
import java.util.Scanner;

public class Question13 {

	void palindrome(int num) {
		int org=num;
		int rem=0;
		int c=0;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			c=c+(rem*rem*rem);
			
		}
		
		if(org==c) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=scn.nextInt();
		Question13 q13=new Question13();
		q13.palindrome(num);
	}
}
