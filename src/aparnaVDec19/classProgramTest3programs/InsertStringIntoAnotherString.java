package aparnaVDec19.classProgramTest3programs;

/*2)	WAP to Insert a String into another String in Java
 *      Input: TechnoPune
         Output: TechnoCreditsPune	
	     Another String: CreditesAfter the Techno    
 */
public class InsertStringIntoAnotherString {

	public void insertString() {
		String prevousString = "TechnoPune";
		String addMiddleString = "Credits";
		String afterStringAddition = prevousString.substring(0, 6) + addMiddleString + prevousString.substring(6);
		System.out.println("String after Addition: >  " + afterStringAddition);
	}

	public static void main(String[] args) {
		InsertStringIntoAnotherString appendString = new InsertStringIntoAnotherString();
		appendString.insertString();
	}
}
