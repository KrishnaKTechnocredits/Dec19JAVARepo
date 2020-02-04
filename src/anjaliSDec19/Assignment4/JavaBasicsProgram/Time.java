/*
 * 7.	Write a Java program to convert seconds to hour, minute andseconds.
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class Time {

	void convertTime(int sec1)
	{
		int hr=0, min=0,sec;
		sec = sec1%60;
		hr = sec1/60;
		min= hr%60;
		hr = hr/60;
		System.out.println("Hour : "+ hr+ " Minute : "+ min+" Seconds : "+ sec);
	}
	public static void main(String[] args) {
		Time obj = new Time();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time in Seconds : ");
		int sec = Integer.parseInt(scan.nextLine());
		obj.convertTime(sec);
		scan.close();
	}
}
