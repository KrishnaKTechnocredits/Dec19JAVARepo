package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*5) WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654
*/

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = Integer.parseInt((sc.nextLine()));
		Program5 prg = new Program5();
		prg.reverseNum(num);
	}

	void reverseNum(int num) {
		int reversed = 0;
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		System.out.println(reversed);
	}
}
