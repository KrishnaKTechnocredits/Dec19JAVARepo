package pravinSDec19.assignment3;

/*
 * Created by : Pravin Sarda
 * Assignment 3 : Question 5
		WAP to reveres user given number
	a. Input number:- 456789
	b. Output number :- 987654
 * 
 * 
 * 
 */
public class Question5 {

	// reverseNum method is used to reveres user given number.
	static void reverseNum(int num) {

		int revNum = 0;
		int temp = 0;

		while (num != 0) {

			temp = num % 10;

			revNum = revNum * 10 + temp;

			num = num / 10;

		}

		System.out.println("Reverse number of given number is " + revNum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 159753;
		reverseNum(num);

	}
}