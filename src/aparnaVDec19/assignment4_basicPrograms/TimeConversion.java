package aparnaVDec19.assignment4_basicPrograms;

/* 7.	Write a Java program to convert seconds to hour, minute and seconds.
 */
import java.util.Scanner;

public class TimeConversion {

	public void convertTime(int seconds) {
		int hours = 0;
		int minutes = 0;

		hours = seconds / 60;
		minutes = hours % 60;
		seconds = seconds % 60;
		hours = hours / 60;

		System.out.println("HH:MM:SS:-> " + hours + " : " + minutes + " : " + seconds);
	}

	public static void main(String[] args) {
		TimeConversion obj = new TimeConversion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time in Seconds : ");
		int seconds = Integer.parseInt(sc.nextLine());
		obj.convertTime(seconds);
		sc.close();
	}
}
