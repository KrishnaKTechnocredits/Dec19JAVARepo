package shitalSDec19.exampleson18thJan2020;

import java.util.Scanner;
public class SwapWithoutTempVariable {
	
	void swapNosWithoutTempVariable (int x,int y)
	{
		y = (x+y);
		x= y-x;
		y = y-x;
		
		System.out.println("Swapping without temporary variables :" + x + "\t" + y);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter two numbers which you want to swap");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		SwapWithoutTempVariable swapWithoutTempVariable = new SwapWithoutTempVariable();
		swapWithoutTempVariable.swapNosWithoutTempVariable(a, b);
	}

}
