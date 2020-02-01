package vishwasCDec19.assignment3;
/*
 *WAP to find frequency of user defined character in user defined String
 */
import java.util.Scanner;
public class Q3FreqOfChar 
{
	static int count;

	static void frequency(char uc, String given) 
	{
		for (int i = 0; i < given.length(); i++) 
		{
			if (given.charAt(i) == uc) {
				count++;
			}
		}

	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String given = s.nextLine();
		System.out.println("Enter index of character from string to find frequency");
		int i = s.nextInt();
		char uc = given.charAt(i);
		frequency(uc, given);
		System.out.println(count);
	}
}
