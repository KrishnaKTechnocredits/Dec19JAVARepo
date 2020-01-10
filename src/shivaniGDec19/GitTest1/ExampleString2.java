package shivaniGDec19.GitTest1;

public class ExampleString2 {

	static void count(String input) {
		String[] array = input.split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Word: " + array[i]);
			System.out.println(" Count: " + array[i].length()); // output
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Technocredits Good";
		count(input); // counting no. of letters and words
	}

}
