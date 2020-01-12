package yashashrikDec19;

public class GitTest1 {

	static String[] stringArray;
	static void displayCount(String name)
	{
		
		
		stringArray=name.split(" ");
		System.out.println(stringArray.length);
		
		
	}
	public static void main(String[] args) {
		String name="Hi Hello TechnoCredits Good";
		displayCount(name);
	}
}
