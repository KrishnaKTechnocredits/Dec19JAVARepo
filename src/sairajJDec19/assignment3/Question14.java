package sairajJDec19.assignment3;

public class Question14 {
	int [] uniqueArray(int[] a, int[] b) {
		int bOp=0;
		int aOp=0;
		int k = 0;
		int[] op = new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(i == j) {
					aOp =a[i];
					bOp=b[j];
					op[k] = aOp;
					k++;
					op[k] = bOp;
				}
			}
		}
		return op;
	}
	
		public static void main(String[] args) {
			int[] aarr = {1,2,3,4,2,5};
			int[] barr = {5,6,7,8,9,7};
			Question14 q1 = new Question14();
			System.out.println(q1.uniqueArray(aarr, barr));
		}
}
