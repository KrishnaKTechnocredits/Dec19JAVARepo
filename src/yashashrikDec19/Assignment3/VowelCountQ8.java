package yashashrikDec19.Assignment3;
/*8) WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11
*/
import java.util.Scanner;

public class VowelCountQ8 {

	void displayVowelCount(String word)
	{
		int aCnt=0;
		int eCnt=0;
		int iCnt=0;
		int oCnt=0;
		int uCnt=0;
		int total=0;
		for(int i=0;i<word.length();i++)
		{
		char ch=word.charAt(i);
		switch(ch)
		{
		case 'a':
			aCnt++;
			break;
		case 'e':
			eCnt++;
			break;
		case 'i':
				iCnt++;
				break;
		case 'o':
					oCnt++;
					break;
		case 'u':
						uCnt++;
						break;
		}
		total=aCnt+eCnt+iCnt+oCnt+uCnt;
		}
		System.out.println("Count of a is: "+aCnt);
		System.out.println("Count of e is: "+eCnt);
		System.out.println("Count of i is: "+iCnt);
		System.out.println("Count of o is: "+oCnt);
		System.out.println("Count of u is: "+uCnt);
		System.out.println("Total Vowel Count: "+total);
		
		
	}
	public static void main(String[] args) {
	VowelCountQ8 q8=new VowelCountQ8();
	String s;
	System.out.println("Enter String to count number of vowel");
	Scanner s1=new Scanner(System.in);
	s=s1.nextLine();
	q8.displayVowelCount(s);
			
}
}
