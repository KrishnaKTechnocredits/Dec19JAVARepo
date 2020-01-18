package prasadSDec2019.Assignment3;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Question4 {
	int count=0;
	int totNum;
	int sumOfArray() {
		System.out.println("Enter the total number");
		Scanner scn=new Scanner(System.in);
		totNum=scn.nextInt();
		System.out.println("Total number of elements are");
		int a[]=new int[totNum];
		for(int i=0;i<totNum;i++) {
			a[i]=scn.nextInt();
			count=count+a[i];
		}
		return count;
	}
	
	public static void main(String[] args) {
		Question4 q4=new Question4();
		int count=q4.sumOfArray();
		System.out.println("Total Sum is:"+count);
	}
}
