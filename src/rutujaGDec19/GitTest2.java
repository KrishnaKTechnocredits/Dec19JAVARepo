package rutujaGDec19;

public class GitTest2 {
void countWords(String s) {
		
		String[] a = s.split(" ");	//split method returns an string array.
		for (int i = 0; i < a.length; i++) {
			System.out.println("Letters in word "+a[i]+ " are : "+a[i].length());
		}
	}

	public static void main(String[] args) {
		String s = "Hi Hello TechnoCredits Good";
		GitTest2 t1 = new GitTest2();
		t1.countWords(s);
		
	}

}
