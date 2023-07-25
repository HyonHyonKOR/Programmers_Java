class Solution {
    public int solution(String my_string) {
        
        int answer = 0;
        
        my_string = my_string.replaceAll("[A-Za-z]","");        
        
        String[] numbers = my_string.split("");
        
        for(String a : numbers){
            answer += Integer.parseInt(a);
        }
            
        return answer;
    }
}