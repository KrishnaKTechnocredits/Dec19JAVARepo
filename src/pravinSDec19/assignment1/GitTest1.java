package pravinSDec19.assignment1;

public class GitTest1 {

	static void countWords(String str) {
		
		String[] strArray = str.split(" ");
		System.out.println("Total words: "+strArray.length);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi Hello Technocredits Good";
		countWords(str);
		
		
	}

}
