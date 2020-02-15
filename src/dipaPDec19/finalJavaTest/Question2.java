package dipaPDec19.finalJavaTest;

/*
WAP to Insert a String into another String in Java
Input: TechnoPune
	Output: TechnoCreditsPune	
	Another String: CreditesAfter the Techno
 */
public class Question2 {

	String str1 = "Credites";

	public static void main(String[] args) {
		String str = "TechnoPune";
		Question2 que2 = new Question2();
		System.out.println(que2.stringIntoAnother(str, 6));
	}

	String stringIntoAnother(String str, int index) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {

			s = str.substring(0, index) + str1;
			s = s + str.substring(index);
		}
		return s;
	}
}
