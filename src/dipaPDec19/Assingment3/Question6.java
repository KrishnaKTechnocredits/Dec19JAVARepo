package dipaPDec19.Assingment3;

/*
 * WAP to find reverse max length string
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
	b. Output Max length string :- Technocredits
	c. Max length string reverse value :- stiderconhcet
 */
public class Question6 {
	public static void main(String[] args) {
		Question6 que = new Question6(); // object creation
		String[] str = { "all the best", "technocredits", "", "maharashtra" };
		System.out.println("Max length string : " + que.getMaxReverseString(str));
		que.reverseString(que.getMaxReverseString(str));

	}
/*Get Max length string*/
	String getMaxReverseString(String[] str1) {
		int maxLength = 0;
		String maxString = null;
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].length() > maxLength) {
				maxLength = str1[i].length();
				maxString = str1[i];
			}
		}

		return maxString;
	}
/*Store string into reverse order*/
	void reverseString(String str2) {
		String temp = "";
		for (int j = str2.length() - 1; j >= 0; j--) {

			temp = temp + str2.charAt(j);
		}
		System.out.println("Max length string reverse value :" + temp);

	}
}
