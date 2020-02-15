package prasadSDec2019Test;

public class Program5 {

	public static void main(String[] args) {
		String s="Hello,How are you?";
		System.out.println("Given String is:");
		System.out.println(s);
		s=s.replaceAll("[,?]", " ");
		System.out.println("After removing non-alphanumbric elements:");
		System.out.println(s);
		
	}
}
