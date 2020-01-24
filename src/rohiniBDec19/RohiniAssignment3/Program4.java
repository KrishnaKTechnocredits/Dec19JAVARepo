package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*WAP to find sum of user given number*. 
 *a. Input:- 159753 b. Sum of given number:- 30 */

public class Program4 {

	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for summation");
		String num = sc.nextLine();
		Program4 prg = new Program4();
		prg.calcSum(num);
	}

	void calcSum(String num) {

		for (int i = 0; i < num.length(); i++)

		{
			sum = sum + Integer.parseInt(String.valueOf((num.charAt(i))));
		}
		System.out.println(sum);

	}

}
