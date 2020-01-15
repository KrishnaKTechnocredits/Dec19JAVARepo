/* WAP to find number is Armstrong or not. 
 * a. Int number = 153 i. Number is Armstrong 
 * b. Int number = 234 i. Number is not Armstrong  
 * Note :- Armstrong number means sum of each number cubes to number it self. 
  */

package shitalSDec19.assignment3;
import java.util.Scanner;
public class Solution13 {
	
	static int sum = 0;
	
	
	public static void main(String[] args) {
		System.out.println("please provide no of iterations you want");
		 Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		for (int i=0; i<size; i++)
			{
				System.out.println("Enter number");
				Scanner scan = new Scanner (System.in);
				char ch = scan.next().charAt(0);
				int multiply = ch * ch * ch;
				sum = sum + multiply;
				
			}
			System.out.println("no is armstrong no");
	}
	
}
