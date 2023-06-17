class Solution {
    public int solution(int num1, int num2) {
        int answer=0;
        if(num1>0 && num2 >0 && num1<=100 && num2<=100){
        float a = (float)num1/num2;
        float b = a*1000;
        answer = (int)Math.floor(b);    
        }
        return answer;
    }
}