package shitalSDec19.exampleson18thJan2020;

public class DifferentiateAplhaNumericAndSum {

	public static void main(String[] args) {
		String s = "H125ABZ7C";
		String number = "";
		String alphabets = "";
		for (int i = 0; i < s.length(); i++) {
			boolean isDigit = Character.isDigit(s.charAt(i));
			if (isDigit == true) {
				number = number + Integer.parseInt(String.valueOf(s.charAt(i)));
			} else
				alphabets = alphabets + s.charAt(i);
			;
		}
		System.out.println("Numbers sum is : " + number + " and alphabets are : " + alphabets);

	}
}
