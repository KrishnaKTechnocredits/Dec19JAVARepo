package pravinSDec19.assignment3;

/*
 *  * Created by : Pravin Sarda
 * Assignment 3 : Question 13
	WAP to find number is Armstrong or not.
	a. Int number = 153
	i. Number is Armstrong
	b. Int number = 234
	i. Number is not Armstrong
	Note :- Armstrong number means sum of each number cubes to number it self.
 * 
 * 
 */
public class Question13 {

	static void checkNumIsArmstrong(int num) {

		int armSum = 0;
		int temp = 0;
		int orgNum = num;

		while (num != 0) {

			temp = num % 10;

			armSum = armSum + temp * temp * temp;

			num = num / 10;

		}

		if (orgNum == armSum)
			System.out.println("Given number is armstrong " + armSum);
		else
			System.out.println("Given number is not a armstrong " + armSum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 153;
		checkNumIsArmstrong(num);

	}
}