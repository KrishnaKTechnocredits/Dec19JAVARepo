//3)Write a program to print the sum of element’s squares of an array having size of N. 

class ElementSquare {

 int squareOfArray(int num[]) {
	 int count=0;
	 for(int i=0;i<num.length;i++) {
		 count=count+num[i]*num[i];
	 }
	 return count;
 }

	public static void main(String[] args) {
		int num[]={4,7,2,8,5};
		ElementSquare sum=new ElementSquare();
		int count=sum.squareOfArray(num);
		System.out.println("sum of elements square is "+count);
	}
}