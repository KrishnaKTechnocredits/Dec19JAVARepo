package poonamDDec19.Assignment1;
/*
 *  a program to print the sum of all the elements of an array of size 4
 */
public class AddArrayElements {
	void add(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of all the elements of an array of size "+arr.length+" is "+sum);
	}
	public static void main(String[] args) {
		AddArrayElements ad=new AddArrayElements();
		int[] x = {2,4,6,8};
		ad.add(x);
	}

}
