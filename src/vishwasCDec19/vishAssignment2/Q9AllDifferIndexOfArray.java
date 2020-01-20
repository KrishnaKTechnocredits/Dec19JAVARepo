package vishwasCDec19.vishAssignment2;
/*
 * Find all differ index from given arrays
 */

public class Q9AllDifferIndexOfArray {
	static void findDuplictaeNo(int[] arr1,int[]arr2)
	{
	 for(int i = 0; i < arr1.length; i++) 
	 	{  
         for(int j =i; j < arr2.length; j++)
         {  
             if(arr1[i] == arr2[j]) 
            	 
             {
            	 break;
                  
             }  
            
             System.out.println("Values are not matching at index "+i); 
             break;
             
         } 
         
	   }
	}
	
    public static void main(String[] args) 
    {      
         
         int[] arr1=new int[] {10,2,9,14,3};
         int[] arr2=new int[] {10,1,9,5,3};
    	 findDuplictaeNo(arr1,arr2);
        
    }  
}  


