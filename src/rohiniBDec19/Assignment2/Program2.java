package rohiniBDec19.Assignment2;

/* Find duplicate number on Integer array in Java*/

public class Program2 {

	   void findDuplicate(int n[])
	   {
		   for(int i=0;i<n.length;i++)
		   {
			   for(int j=i+1;j<n.length;j++)
			   {
				   if(n[i]==n[j])
				   System.out.println("Duplicate number is :"+n[i]);
				    
				}
			}
		}
		
		 public static void main(String[] args) {
			int[] num= {0,1,2,3,4,5,1,9};
			Program2 pgrm = new Program2();
			pgrm.findDuplicate(num);
			
	   }
		
}



