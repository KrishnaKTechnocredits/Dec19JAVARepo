package rutujaGDec19.Assignment2;
/*to reverse array*/
public class Question13 {
	void reverseArray(int[] a) {
		int[] arr = new int[255];
		int j = a.length;
		for (int i = 0; i < a.length; i++) {
		    arr[j-1] = a[i];
			j = j-1;
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {5,6,9,10,14,63};
		Question13 q = new Question13();
		q.reverseArray(a);
		
		
	}

}
