package sairajJDec19.assignment3;

public class Question15 {
	void printString(String[] a) {
		for(int i =0; i<a.length;i++) {
			if(a[i].length()>=7) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] a = {"krishna", "maulik", "aakash", "harsh", "mane","firminobobby", "mosalahh"};
		Question15 q1 = new Question15();
		q1.printString(a);
	}
}
