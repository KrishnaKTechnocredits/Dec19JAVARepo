package programsTest;
/*
 * 
 * 2)	WAP to Insert a String into another String in Java

Input: TechnoPune
	
Output: TechnoCreditsPune	
	Another String: CreditesAfter the Techno
	*/
public class InsertCredits {
	public static void main(String[] args) {
		String s="TechnoPune";
		String s1="Credits";
		String output=s.substring(0,6);
		String s2=output +s1;
		System.out.print(s2+s.substring(6,s.length()));
	
	}
		
	}


