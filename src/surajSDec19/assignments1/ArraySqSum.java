import java.util.Scanner; 
public class ArraySqSum{

void squareSum(int[] arr){
int totalSum=0;
int elementSquare=0;
for(int i=0; i<arr.length;i++){
elementSquare=arr[i]*arr[i];
totalSum=totalSum+elementSquare;
}
System.out.println("Total sum of square of elements of array: "+totalSum); 
}

public int[] arrayIntialization(){
Scanner in=new Scanner(System.in);
System.out.println("Enter Length of array:");
int n=in.nextInt(); 
int[] arr=new int[n];
arr[0]=10;
arr[1]=5;
arr[2]=2;
arr[3]=1;
return arr; 

}

public static void main(String[] args)
{
ArraySqSum arraySqSum=new ArraySqSum();
int[] arrInt=arraySqSum.arrayIntialization();
arraySqSum.squareSum(arrInt); 
}
}
