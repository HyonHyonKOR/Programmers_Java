class Solution {
    
    int answer = 1;
    int temp = 1;
    
    public int solution(int n) {
        
        while(true){
            temp *= answer;
            if(temp > n){break;}
            answer++;
        }
        return answer-1;
    }
}