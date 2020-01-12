package vishwasCDec19.vishwasAssignment2;
/*
 * Check if array contains a number in Java?
 */

public class Q3ArrayContainsNO {

	static boolean found = false;
	static void findDuplictaeNo(int[] arr,int m)
	{

	 for(int i = 0; i < arr.length; i++)
	 	{  
        
             if(arr[i] ==m)  
             {
            	 found = true;
                 break;
             } 
            
          } 
	 if(found)
	 {
         System.out.println(m + " is in array list.");
	 }
     else
     {
         System.out.println(m + " is not in array list.");
	  }
}
	 public static void main(String[] args) 
    {      
    	int n=9;
         int [] arr1 = new int [] {1, 2, 4, 2, 7, 8, 3};  
    	 findDuplictaeNo(arr1,n);
        
    }  
}
