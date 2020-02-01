package aparnaVDec19.assignment3;

/*
 * 13) WAP to find number is Armstrong or not.
       a. Int number = 153
       i. Number is Armstrong
       b. Int number = 234
       i. Number is not Armstrong
       Note :- Armstrong number means sum of each number cubes to number it self.
 */
public class NumberIsArmstrongOrNot {
	static void findArmstrongNumber(int number) {
		int num = number;
		int reminder;
		int total = 0;
		while (num != 0) {
			reminder = num % 10;
			total = total + (reminder * reminder * reminder);
			num = num / 10;
		}
		if (total == number)
			System.out.println("Given number: " + number + " is a Armstrong Number");
		else
			System.out.println("Given number: " + number + " is not a Armstrong Number");
	}

	public static void main(String[] args) {
		int number = 153;
		findArmstrongNumber(number);
		int number1 = 234;
		findArmstrongNumber(number1);
	}
}
