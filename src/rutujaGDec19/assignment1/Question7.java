package rutujaGDec19.assignment1;
/*
 * to print absolute difference between two integers*/


public class Question7 {
	int adiff;
	int difference(int x , int y){
		adiff = x-y;
		if(adiff < 0){
			adiff = adiff * -1;
		}
        return adiff;
	}
	public static void main(String[] args){
		Question7 seven = new Question7();
		System.out.println("Difference is : "+seven.difference(5,10));
	}

}
