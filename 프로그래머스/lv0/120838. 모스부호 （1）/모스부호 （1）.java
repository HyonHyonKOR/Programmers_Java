import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] divideLetter = letter.split(" ");
        StringBuilder answer = new StringBuilder();
        
        for(int i =0; i< divideLetter.length; i++){
            answer.append((char)((Arrays.asList(morse).indexOf(divideLetter[i]))+97));   
        }
        return answer.toString();
    }
}