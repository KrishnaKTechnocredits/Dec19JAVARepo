package pravinSDec19;

public class ReverseAllStringOfGivenArray {

	String[] reverseStringProcess(String[] stringArray) {

		String str = null;
		String[] reverseArray = new String[stringArray.length];

		for (int i = 0; i < stringArray.length; i++) {

			String revStr = "";

			str = stringArray[i];

			for (int j = str.length() - 1; j >= 0; j--) {

				revStr = revStr + str.charAt(j);

			}
			reverseArray[i] = revStr;

		}
		return reverseArray;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAllStringOfGivenArray reverseString = new ReverseAllStringOfGivenArray();
		String[] reverseArray = reverseString.reverseStringProcess(args);

		for (int i = 0; i < reverseArray.length; i++) {
			System.out.print(reverseArray[i] + " ");
		}

	}
}
