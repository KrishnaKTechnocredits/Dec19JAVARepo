package prasadSDec2019.Assignment3;
// WAP to find word is palindrome or not
import java.util.Scanner;

public class Question12 {
	
	void strPalindrome(String s) {
		String org=s;
		String reverse="";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		if(org.equalsIgnoreCase(reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
	}
	

	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.nextLine();
		
		Question12 q12=new Question12();
		q12.strPalindrome(s);
	}

}
