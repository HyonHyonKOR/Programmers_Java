import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] divideLetter = letter.split(" ");
        StringBuilder answer = new StringBuilder();
        
        for(int i =0; i< divideLetter.length; i++){
            answer.append((char)((Arrays.asList(mos).indexOf(divideLetter[i]))+97));   
        }
        return answer.toString();
    }
    
    String[] mos = {".-","-...","-.-.","-..",".","..-.",
                    "--.","....","..",".---","-.-",".-..",
                    "--","-.","---",".--.","--.-",".-.",
                    "...","-","..-","...-",".--","-..-",
                    "-.--","--.."};
}