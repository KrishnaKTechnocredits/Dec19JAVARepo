package kedarKDec19.Assignment3;

public class Question15 {

	static void display(String[] s, int length) {
		String nameString = "";

		// Checking length of each string from array. If it is maximum than given length
		// then printing it

		System.out.print("Strings having length more than " + length + " are: ");

		for (int i = 0; i < s.length; i++) {

			nameString = s[i];

			if (nameString.length() > length) {

				System.out.print(s[i]);
				System.out.print(" , ");

			}
		}

	}

	public static void main(String[] args) {
		String[] s = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		display(s, 6);
	}
}
