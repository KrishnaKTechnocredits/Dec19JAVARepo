package rutujaGDec19.assignment2;
/*
 * equality of two arrays 
 * */
public class Question6 {
	void compareArr(int[] a1 , int[] a2) {
		for (int i = 0; i < a1.length; i++) {
				if(a1[i] == a2[i]) {
					if(i==(a1.length - 1))
					System.out.println("Array are Equal");
				}
				else {
					System.out.println("Array are not equal");
					break;
				}
			}
	}

	public static void main(String[] args) {
		int[] a1 = {21 , 57 , 11 , 37 , 24};
		int[] a2 = {21 , 57 , 11 , 37 , 23};
		Question6 q = new Question6();
		q.compareArr(a1, a2);
	}

}
