package shivaniGDec19.GitTest1;

public class ExampleString {

	static void count(String input) {
		String[] array = input.split(" ");
		System.out.println("Length: " + array.length); //output
	}

	public static void main(String[] args) {
		String input = "Hi Hello Technocredits Good";
		count(input); //counting no. of words
	}
}