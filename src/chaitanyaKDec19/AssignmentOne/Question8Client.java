package chaitanyaKDec19.AssignmentOne;

/*You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. 
 * Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the String s.
 */

class Question8Client{
    
    public static void main(String args[]){
        
        String strOne = "You try to become Automation expert at TechnoCredits";
        String strTwo = "I will try to become Automation expert at TechnoCredits and I will";
        
        Question8 countVowel = new Question8();
        
        countVowel.displayVowelCount(strOne);
        System.out.println();
        countVowel.displayVowelCount(strTwo);
        
    }
}