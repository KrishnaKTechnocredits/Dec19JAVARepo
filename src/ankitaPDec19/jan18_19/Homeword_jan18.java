package ankitaPDec19.jan18_19;

public class Homeword_jan18 {
	public static void main(String[] args) {
		String str = "213hs.[][$%ABF";
		Homeword_jan18 obj1 = new Homeword_jan18();
		obj1.findnumber(str);
	}

	void findnumber(String s) {
		String upper = "";
		String lower = "";
		String number = "";
		String special = "";
		int num = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch))
				upper = upper + s.charAt(i);
			else if (Character.isLowerCase(ch))
				lower = lower + s.charAt(i);
			else if (Character.isDigit(ch)) {
				num = Integer.parseInt(String.valueOf(ch));
				if (num % 2 == 0)
					even = even + num;
				else
					odd = odd + num;
			} else
				special = special + s.charAt(i);
		}
		System.out.print(upper + odd + special + even + lower);
	}
}
