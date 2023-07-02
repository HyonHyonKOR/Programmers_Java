class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i=0; i<numbers.length;i++){
        answer += numbers[i]*1.0;
        }
        return answer/numbers.length;
    }
}