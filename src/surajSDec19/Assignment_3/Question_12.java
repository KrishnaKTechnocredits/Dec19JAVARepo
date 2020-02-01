package surajSDec19.Assignment_3;
/*WAP to find word is palindrome or not ?

*/
import java.util.Scanner;

public class Question_12 {

	public void palindromeString(String str) {
		String palindromeString="";
		for(int i=str.length()-1;i>=0;i--) {
			palindromeString=palindromeString+str.charAt(i);
		}
		
		if(str.equals(palindromeString)) {
			System.out.println(str + " Is palindrome string");
		} else {
			System.out.println(str + " is not palindrome string");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		Question_12 question_12=new Question_12();
		question_12.palindromeString(str);
		
	}

}
