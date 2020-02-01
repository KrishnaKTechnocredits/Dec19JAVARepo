package rohiniBDec19.GitTest1;

/*WAP to reverse a string and substring as well*/

public class ReverseWholeString {
	static String str3 = " ";

	public static void main(String[] args) {
		String str = "Hi Good Morning All";
		reverseStr(str);
	}

	private static void reverseStr(String str) {
		String[] strArr = str.split(" ");
		for (int i = strArr.length - 1; i >= 0; i--) {

			{
				String str2 = strArr[i];
				for (int j = str2.length() - 1; j >= str2.indexOf(str2.charAt(0)); j--) {
					System.out.print(str2.charAt(j));

				}
				System.out.print(str3);
			}

		}

	}
}
