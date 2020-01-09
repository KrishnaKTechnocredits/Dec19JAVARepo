package rutujaGDec19.assignment2;
/*
 * To find number in array that is repeated
 * */
public class Question2 {
	void findDuplicate(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("Repeated Number is : "+ a[i]);
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,4};
	    Question2 q = new Question2();
	    q.findDuplicate(a);
	}

}
