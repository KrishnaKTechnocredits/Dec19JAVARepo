package pravinSDec19.TestPrograms;

/*
2)	WAP to Insert a String into another String in Java
	Input: TechnoPune
	Output: TechnoCreditsPune	
	Another String: Credites After the Techno
 * 
 * 
 */

public class Q2InsertStringInToAnotherString {

	static String mergeString(String str1, String str2) {

		String mergeStr = "";
		char ch;
		int count = 0;
		int index = 0;
		for (int i = 0; i < str1.length(); i++) {

			ch = str1.charAt(i);
			if (Character.isUpperCase(ch))
				count++;
			if (count > 1) {
				index = i - 1;
				break;
			}
		}

		for (int i = 0; i < str1.length(); i++) {

			if (i != index) {
				ch = str1.charAt(i);
				mergeStr = mergeStr + ch;

			} else {
				for (int j = 0; j < str2.length(); j++) {
					ch = str2.charAt(j);
					mergeStr = mergeStr + ch;

				}

			}
		}

		return mergeStr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "TechnoPune";
		String str2 = "Credites";

		String mergeStr = mergeString(str1, str2);
		System.out.println(mergeStr);

	}

}
