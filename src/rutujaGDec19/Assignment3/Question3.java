package rutujaGDec19.Assignment3;
/*calculate frequency for letter e*/
import java.util.Scanner;
public class Question3 {
	static void calFrequency(String s) {
		int count = 0;
		for(int i =0 ; i < s.length(); i++) {
			if(s.charAt(i) == 'e') {
			   count++;
			}
		}
		 System.out.println("Frequency of e in String : "+s+" is "+count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s ;
		System.out.println("Enter a String:");
		s = sc.next();
	     calFrequency(s);
	
	   
	}

}
