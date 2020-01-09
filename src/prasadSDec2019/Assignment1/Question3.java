package prasadSDec2019.Assignment1;
import java.util.Scanner;

public class Question3 {
	
	int sumOfArray() {
		int n;
		int count=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the numbr of array elements");
		n=scn.nextInt();
		System.out.println("Enter the array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
			count=count+a[i];
		}
		return count;
	}
		
		
	
	public static void main(String[] args) {
		Question3 q3=new Question3();
		int count=q3.sumOfArray();
		System.out.println("Sum of all the array elements is "+count);
	}
}
