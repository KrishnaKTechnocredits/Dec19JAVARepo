package chaitanyaKDec19;

/* Count the number of words in a given string
 * Count the number of characters in a word
 */

public class GitTest1 {

	void countWordChars(String string) {
		
		String[] arrOfStr = string.split(" ");
		System.out.println("Total number of words: "+arrOfStr.length);
		
		for(int i=0; i<arrOfStr.length; i++) {
			
			String wordOfString = "";
			wordOfString = arrOfStr[i];
			int counter=0;
			
			for(int j=0; j<wordOfString.length(); j++) {
				counter++;
			}
			
			System.out.println(wordOfString+ ":"+counter);
		}
	}
	
	public static void main(String[] args) {
		
		new GitTest1().countWordChars("Hi Hello TechnoCredits Good");

	}

}
