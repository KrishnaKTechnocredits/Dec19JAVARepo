package pravinSDec19;

public class filterCharNumberSpecialCharFromGivenString {

	void filterCharNumProcess(String str) {

		String charStr = "";
		String numStr = "";
		String speStr = "";
		int Sum = 0;

		for (int i = 0; i < str.length(); i++) {

			String chStr = "";

			if (Character.isDigit(str.charAt(i))) {
				numStr = numStr + str.charAt(i);
				chStr = chStr + str.charAt(i);
				Sum = Sum + Integer.parseInt(chStr);
			} else if (Character.isLetter(str.charAt(i))) {
				charStr = charStr + str.charAt(i);
			} else
				speStr = speStr + str.charAt(i);

		}

		System.out.println("All Number in given string " + numStr);
		System.out.println("Sum of All Number in given string " + Sum);
		System.out.println("All Character in given string " + charStr);
		System.out.println("All Special in given string " + speStr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterCharNumberSpecialCharFromGivenString filter = new filterCharNumberSpecialCharFromGivenString();
		String str = "H125AVB355D$#LK4";
		filter.filterCharNumProcess(str);

	}
}
