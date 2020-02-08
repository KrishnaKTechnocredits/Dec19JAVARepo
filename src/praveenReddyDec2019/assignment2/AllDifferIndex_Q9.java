package praveenReddyDec2019.assignment2;

public class AllDifferIndex_Q9 {
	static void IndexFind(int a[], int b[])
	{
			for(int i=0;i<a.length;i++)
			if (a[i]!=b[i])
			{
				System.out.println("Values are not matchin at Index -> " + i);
				
			}
		//System.out.println("Values are not matchin at Index :" + index);
		
	}
	
	public static void main(String[] args) {
		//AllDifferIndex_Q9 index = new AllDifferIndex_Q9();
		int a[]= {10,2,9,14,3};
		int b[]= {10,2,18,14,13};
		AllDifferIndex_Q9.IndexFind(a,b);
		
	}
	

}
