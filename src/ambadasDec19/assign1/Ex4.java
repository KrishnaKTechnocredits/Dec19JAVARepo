package ambadasDec19.assign1;

public class Ex4 
{
		public void sqaure()
		{
			int arr[] ={3,4,5,6};
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+(arr[i]*arr[i]);
			}
			System.out.println("Total Sum : "+sum);
		}
		public static void main(String[] args) 
		{
			Ex4 x4=new Ex4();
			x4.sqaure();
}
}
