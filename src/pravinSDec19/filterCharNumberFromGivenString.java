package pravinSDec19;

public class filterCharNumberFromGivenString {

	void filterCharNumProcess(String str) {

		boolean isDigit = false;
		String charStr = "";
		String numStr = "";
		int Sum = 0;

		for (int i = 0; i < str.length(); i++) {

			String chStr = "";
			isDigit = Character.isDigit(str.charAt(i));
			if (isDigit) {
				numStr = numStr + str.charAt(i);
				chStr = chStr + str.charAt(i);
				Sum = Sum + Integer.parseInt(chStr);
			} else
				charStr = charStr + str.charAt(i);

		}

		System.out.println("All Number in given string " + numStr);
		System.out.println("Sum of All Number in given string " + Sum);
		System.out.println("All Character in given string " + charStr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterCharNumberFromGivenString filter = new filterCharNumberFromGivenString();
		String str = "H125AVB355D";
		filter.filterCharNumProcess(str);

	}
}
