package chaitanyaKDec19.AssignmentOne;

/*You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. 
 * Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the String s.
 */

class Question8{
    
    void displayVowelCount(String a){
        
        int aCnt=0, eCnt=0, iCnt=0, oCnt=0, uCnt=0;
        
        for(int i=0; i<a.length(); i++){
            
            if(a.charAt(i)==' ')
                i++;                
            
            if(a.charAt(i)=='a' || a.charAt(i)=='A'){
                aCnt++;
            }else if(a.charAt(i)=='e' || a.charAt(i)=='E'){
                eCnt++;
            }else if(a.charAt(i)=='i' || a.charAt(i)=='I'){
                iCnt++;
            }else if(a.charAt(i)=='o' || a.charAt(i)=='O'){
                oCnt++;
            }else if(a.charAt(i)=='u' || a.charAt(i)=='U'){
                uCnt++;     
            }
        }
        
        System.out.println(aCnt+": is the count of 'a' in the given string");
        System.out.println(eCnt+": is the count of 'e' in the given string");
        System.out.println(iCnt+": is the count of 'i' in the given string");
        System.out.println(oCnt+": is the count of 'o' in the given string");
        System.out.println(uCnt+": is the count of 'u' in the given string");
    }
}