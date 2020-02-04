package shivaniGDec19.assignment3;

//WAP to find string which has length more than 7 character
public class CharFreqStringMoreThanSeven {

	static String maxName; // blank

	void findSevenLegth(String input[]) {
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() >= 7) {
				// maxlength = input[i].length();
				maxName = input[i];
				System.out.println("Output is : " + maxName);
			}
		}
	}

	public static void main(String[] args) {
		CharFreqStringMoreThanSeven maxCharFreq = new CharFreqStringMoreThanSeven();
		String input[] = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		maxCharFreq.findSevenLegth(input);
	}
}
