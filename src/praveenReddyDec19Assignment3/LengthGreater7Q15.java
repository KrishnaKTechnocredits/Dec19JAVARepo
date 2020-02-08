package praveenReddyDec19Assignment3;
/*
  WAP to find string which has length more than 7characheter. 
  a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”} 
  b. Output :- Krishna, aakansha, abhishek 
 */

public class LengthGreater7Q15 {
	static void LenghtOfString(String[] array) {
		int count = 0;
		String Maxlength = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 6) {
				count = array[i].length();
				Maxlength = array[i];
				System.out.print(count + "-");
				System.out.print(Maxlength + ",");
			}
		}
	}

	public static void main(String[] args) {
		String[] array = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		LengthGreater7Q15.LenghtOfString(array);
	}
}
