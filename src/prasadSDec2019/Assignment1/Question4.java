package Assignment1;

//Write a program to print the sum of element’s squares of an array having size of N. 

public class Question4 {
	
 int squareOfArray(int num[]) {
	 int count=0;
	 for(int i=0;i<num.length;i++) {
		 count=count+num[i]*num[i];
	 }
	 return count;
 }
	
 public static void main(String[] args) {
	int num[]={4,7,2,8,5};
	Question4 q4=new Question4();
	int count=q4.squareOfArray(num);
	System.out.println("sum of element’s squares of an array is "+count);
}
}
