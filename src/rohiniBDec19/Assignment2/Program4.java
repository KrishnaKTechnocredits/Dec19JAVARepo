package rohiniBDec19.Assignment2;

/*4) Largest and smallest number in unsorted array? */


public class Program4 {
	
	int temp;
	void findNum(int arr[]) {	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			 }
		}
		System.out.println("Smallest number is: "+arr[0]);
		System.out.println("Largest number is: "+arr[arr.length-1]);
		
	}
	
	public static void main(String[] args) {
		Program4 prgm =new Program4();
		int[] arr= {1,4,15,10,30,45};
		prgm.findNum(arr);
	}

}
