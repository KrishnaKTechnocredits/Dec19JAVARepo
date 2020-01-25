package shitalSDec19.practiseQuestions;

public class SwapStrings {

	public static void main(String[] args) {
		String a = "abc23";
		String b = "xyz323";
		// a = String.valueOf(a.length()+b.length());
		a = a + b;
		// b=a.length()-b.length();
		// a=a.length()-b.length();
		//System.out.println(a);
		// a= String.valueOf(a.length()-b.length());
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
