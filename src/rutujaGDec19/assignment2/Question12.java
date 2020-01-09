package rutujaGDec19.assignment2;
/*
 * to print common number from two different array*/
public class Question12 {
	
	void compareArray(int[] a, int[] b){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j])
					System.out.println(b[j] +" is repeated");
			}
		}
	} 
 
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {4,5,6,7,8,9};
		Question12 q = new Question12();
		q.compareArray(a, b);
		
	}
}
