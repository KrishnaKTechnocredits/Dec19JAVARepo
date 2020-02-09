package ambadasDec19.assign1;

public class Ex9 {
	public void countOccurance(String number) {
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			int count = 0;
			for (int j = 0; j < number.length(); j++) {
				char newchar = number.charAt(j);
				if (ch == newchar)
					count++;
			}
			System.out.println("[" + ch + "] :==> " + count);
		}
	}

	public static void main(String[] args) {
		Ex9 x9 = new Ex9();
		x9.countOccurance("128896");
	}
}
