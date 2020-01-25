package yashashrikDec19.Assignment2;
/*6)Write a java program to check the equality of two arrays?
Hint: Input Arrays :
First Array : [21, 57, 11, 37, 24]
Second Array : [21, 57, 11, 37, 24]
Two Arrays Are Equal*/


public class CompareArrayQ6 {

	void arrayMatched(int[] X1,int[] X2)
	{
		String flag="Y";
		for(int i=0;i<X1.length;i++)
		{
			
				if(X1[i]!=X2[i])
				flag="N";	
					
		}
		if(flag=="Y")
			System.out.println("Two arrays are matched");
		
	}
	public static void main(String[] args) {
		CompareArrayQ6 compare=new CompareArrayQ6();
		int[] arr1= {21,57,11,37,24};
		int[] arr2= {21,57,11,37,24};
		compare.arrayMatched(arr1,arr2);
	}
}
