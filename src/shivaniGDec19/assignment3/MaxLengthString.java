package shivaniGDec19.assignment3;

//WAP to find max length String from the given array.

public class MaxLengthString {

	static int maxlength; // 0
	static String maxName; // blank

	String findMaxLegth(String input[]) {
		maxlength = input[0].length(); // assigning default value
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxlength) {
				maxlength = input[i].length();
				maxName = input[i];
			}
		}
		return maxName;
	}

	public static void main(String[] args) {
		MaxLengthString maxCharFreq = new MaxLengthString();
		String input[] = { "all the best", "technocredits", " ", "maharashtra" };
		String maxName = maxCharFreq.findMaxLegth(input);
		System.out.println("Maximum length name is " + maxName);
	}

}
