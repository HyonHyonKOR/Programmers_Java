import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        
    StringBuilder sb = new StringBuilder();       
    HashSet<Character> hashset = new HashSet<>(); 
        
    for(char key : my_string.toCharArray()){
     if(hashset.add(key)) sb.append(key);    
     }
     return sb.toString();
   }
}