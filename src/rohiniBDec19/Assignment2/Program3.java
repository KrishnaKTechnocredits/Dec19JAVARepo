package rohiniBDec19.Assignment2;

/*) Find duplicate number on Integer array in Java*/

public class Program3 {
	
	void findNum(int a[],int n) {
		boolean flag=true;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==n)
			{
				flag=false;
				System.out.println(n+" :Number is exist in array ");
			}
		}
		if(flag)
		System.out.println(n+" :Number is not exist in array ");
		
	}
	
	public static void main(String[] args) {
		Program3 prgm = new Program3();
		int[] arr= {1,8,9,0,3,4,5,6};
		int number=10;
		prgm.findNum(arr, number);
		
	}

}
