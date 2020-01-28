package rutujaGDec19.Assignment3;
/*Print string that has more than 7 characters*/
public class Question15 {
	static void greaterThanLength(String[] a) {
		
		for (int i = 0; i < a.length; i++) {
			if(7 <= a[i].length()) {
			System.out.println(a[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		String[] a = {"Krishna","Maulik","Harsh","abhishek","aakansha"};
		greaterThanLength(a);
		
	}

}
