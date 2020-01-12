package vishwasCDec19.vishAssignment2;
/*
 * Find duplicate number on Integer array in Java
 */

public class Q2FindDuplicateNo  

{  
	static void findDuplictaeNo(int[] arr)
	{
	System.out.println("Duplicate elements in given array: ");
	 for(int i = 0; i < arr.length; i++) 
	 	{  
         for(int j = i + 1; j < arr.length; j++)
         {  
             if(arr[i] == arr[j])  
             {
                 System.out.println(arr[j]);  
             }  
         } 
	   }
	}
	
    public static void main(String[] args) 
    {      
         int [] arr1 = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
    	 findDuplictaeNo(arr1);
        
    }  
}  
