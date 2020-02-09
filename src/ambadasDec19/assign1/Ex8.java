package ambadasDec19.assign1;

class Ex8 {
	public void countVowels(String str) {
		int counter = 0;
		System.out.println("Length of String : " + str.length());
		char vow[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < str.length(); i++) {
			char mychar = str.charAt(i);
			for (int j = 0; j < vow.length; j++) {
				char vovchar = vow[j];
				if (mychar == vovchar) {
					counter++;
					break;
				}
			}

		}
		System.out.println(" Total Vowels in [" + str + "] :==> " + counter);
	}

	public static void main(String arg[]) {
		Ex8 x8 = new Ex8();
		x8.countVowels("AmbadAs");
	}
}
