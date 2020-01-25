package rutujaGDec19;
/*
 * Print number of words in string
 * */
public class GitTest1 {
	void countWords(String s) {
		
		String[] a = s.split(" ");	//split method returns an string array.
		
		System.out.println("Number of words in string are : "+a.length);
	}

	public static void main(String[] args) {
		String s = "Hi Hello TechnoCredits Good";
		GitTest1 t1 = new GitTest1();
		t1.countWords(s);
		
	}
}
