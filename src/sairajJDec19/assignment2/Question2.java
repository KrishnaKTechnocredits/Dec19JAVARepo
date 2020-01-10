package sairajJDec19.assignment2;

public class Question2 {
		
	int getDuplicate(int[] a) {
		int ans = 0;
		for(int i = 0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]==a[i]) {
					ans = a[j];
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
			int[] arr = {0, 3, 1, 2, 3};
			Question2 q1 = new Question2();
			int ans = q1.getDuplicate(arr);
			System.out.println("The duplicated number is: "+ ans);
		}
}
