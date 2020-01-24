package amitJDec19.assignment2;
/*
 * Find duplicate number on Integer array in Java
 */
public class Question2 {
	void duplicateNumber(int[] num) {
		for(int i=0;i<num.length;i++) {
			for (int j=i+1;j<num.length;j++) {
				if (num[i]==num[j])
					System.out.println("Duplicate number is: "+num[i]);
			}
		}
	}
	public static void main(String[] args) {
		Question2 m1=new Question2();
		int[] num= {0,1,3,2,3};
		m1.duplicateNumber(num);
	}
}