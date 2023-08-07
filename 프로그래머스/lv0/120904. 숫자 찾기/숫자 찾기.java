class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int count  = 1;
        while(num / 10 > 0) {
            if(num % 10 == k) {
                answer = count;
            }
            num /= 10;
            ++count;
        }
        if(num % 10 == k) {
            answer = count;
        }
        System.out.println(answer);
        System.out.println(count);
        return answer > 0 ? count-answer+1 : -1;
    }
}