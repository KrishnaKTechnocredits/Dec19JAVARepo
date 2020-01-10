package sairajJDec19.assignment2;

public class Question12 {
		static void getCommon(int[] a, int[]b) {
			int[]ans = new int[a.length]; 
			for(int i = 0; i<a.length;i++) {
				for(int j=i; j<b.length; j++) {
					if(a[i]==b[j]) {
						System.out.println("Common numbers are : " + a[i]);
					}
				}
			}
		}
		
		public static void main(String[] args) {
			int [] a = {1,3,6,9,7};
			int [] b = {2,5,6,9,8};
			getCommon(a, b);
		}
}
