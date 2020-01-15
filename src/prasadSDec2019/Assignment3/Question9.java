package prasadSDec2019.Assignment3;

import java.util.Scanner;

public class Question9 {
	
	float agvOfNum() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the total numbers");
		int totNum=scn.nextInt();
		System.out.println("Numbers are");
		int count=0;
		int a[]=new int[totNum];
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
			count=count+a[i];
			
		}
		
		float avg=count/totNum;
		
		return avg;
		
	}
	
	public static void main(String[] args) {
		Question9 q9=new Question9();
		float avg=q9.agvOfNum();
		System.out.println("avg is"+avg);
	}
}
