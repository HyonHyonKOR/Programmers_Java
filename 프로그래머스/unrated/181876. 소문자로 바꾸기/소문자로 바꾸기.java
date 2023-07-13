class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] temp = myString.toCharArray();
        char ch;
        
        for(int i=0; i<temp.length; i++){
          if(temp[i]>='A'&& temp[i]<='Z'){
           ch = Character.toLowerCase(temp[i]);
          }else{
           ch = temp[i];   
          }           
        String a = String.valueOf(ch);  
        answer += a;
        }
        
        return answer;
    }
}