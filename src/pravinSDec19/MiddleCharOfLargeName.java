package pravinSDec19;

public class MiddleCharOfLargeName {

	void displayMiddleChar(String[] stringArray) {

		int maxLength = 0;
		int maxIndex = 0;

		for (int i = 0; i < stringArray.length; i++) {

			String str = stringArray[i];
			int strLength = str.length();

			if (maxLength < strLength) {

				maxLength = strLength;
				maxIndex = i;

			}

		}

		System.out.println("Large Name: " + stringArray[maxIndex]);

		System.out.println("Middle Char of Large Name: " + stringArray[maxIndex].charAt(maxLength / 2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleCharOfLargeName middlechar = new MiddleCharOfLargeName();
		middlechar.displayMiddleChar(args);

	}
}
