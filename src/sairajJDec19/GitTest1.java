package sairajJDec19;

public class GitTest1 {
	
	int getNoOfWords(String a)
	{
		String[] arr = a.split(" ");
		int len = arr.length;
		return len;
	}
	
	public static void main(String[] args) {
		String s = "Hi Hello TechnoCredit Good";
		GitTest1 g1 = new GitTest1();
		System.out.println(g1.getNoOfWords(s));
	}
}
