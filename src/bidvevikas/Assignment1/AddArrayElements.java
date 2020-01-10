
//2)a program to print the sum of all the elements of an array of size 4
 
class AddArray {
	void add(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of all the elements of an array of size "+arr.length+" is "+sum);
	}
	public static void main(String[] args) {
		AddArray ad=new AddArray();
		int[] x = {10,23,18,10};
		ad.add(x);
	}

}