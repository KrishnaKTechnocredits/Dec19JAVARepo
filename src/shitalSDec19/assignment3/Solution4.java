/*  WAP to find sum of user given number. 
 * a. Input:- 159753 
 * b. Sum of given number:- 30  */

package shitalSDec19.assignment3;
import java.util.Scanner;
public class Solution4 {
static int sum=0;
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num!=0)
			{
				int a = num%10;
				num = num/10;
				sum = sum + a;
				
			}
		System.out.println(sum);
		
		
	}
}
