class Solution {
    public int solution(String my_string) {
        
        String[] arr = my_string.split("[a-zA-Z]");
        int answer = 0;
        
        for(String s : arr){
           if(s.equals("")) continue; 
           answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}