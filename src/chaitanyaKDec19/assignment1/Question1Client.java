package chaitanyaKDec19.assignment1;

class Question1Client{
    
    public static void main(String[] args){
        
        //calling directly without storing reference variable in temp variable
    	new Question1().doSum(40, 50);
        
        Question1 q1 = new Question1();
        
        //calling method using reference variable
        q1.doSum(-99, -55);
    }
}