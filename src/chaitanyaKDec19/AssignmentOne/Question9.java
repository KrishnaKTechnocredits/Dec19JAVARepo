package chaitanyaKDec19.AssignmentOne;

class Question9{
    
    void countNumbers(String number){
        
		char ch;
		int index = 0;
		
		for(int i=0; i<number.length(); i++) {
			
			int counter = 0;
			ch = number.charAt(i);
			index = number.indexOf(ch);
			
			if(i==index) {
				
				for(int j=0; j<number.length(); j++) {
					
					if(number.charAt(j) == number.charAt(i))
						counter++;
				}
				
				System.out.println("Frequency of digit " + number.charAt(i) + " in a given string is: "+ counter);
			}
		}	
    }    
}