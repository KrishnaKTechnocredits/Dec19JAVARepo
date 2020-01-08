package Assignment1;
import java.util.Scanner;

public class Question6 {
	void  addCorrespondingElements() {
		int sum;
		int n;
		System.out.println("Enter the number of array lements");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		int arrNum1[]=new int[n];
		System.out.print("Enter number of array");
		for(int i=0;i<n;i++) {
			arrNum1[i]=scn.nextInt();
			
		}
		
		int arrNum2[]=new int[n];
		System.out.print("Enter number of array");
		for(int i=0;i<n;i++) {
			arrNum2[i]=scn.nextInt();
		}
		
		System.out.println("Sum of corresponding array elements are");
		for(int i=0;i<arrNum1.length;i++) {
			sum=arrNum1[i]+arrNum2[i];
			System.out.print(" "+sum);
		}

	}
	
	public static void main(String[] args) {
		Question6 q6=new Question6();
		q6.addCorrespondingElements();
	}
}
