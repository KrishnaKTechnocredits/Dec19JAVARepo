package amitJDec19.assignment2;
/*
 * Write a java program to find second largest element in an array of integers
 */
public class Question5 {
	int temp;
	void secondLargest(int[] num) {	
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			 }
		}
		System.out.println("Second largest element in an array of integers is: "+num[num.length-2]);
	}
	public static void main(String[] args) {
		Question5 m1 =new Question5();
		int[] num= {1,4,15,10,30,45};
		m1.secondLargest(num);
	}
}