class Solution {
    public int[] solution(int[] num_list, int n) {
        double size = (double)num_list.length/n;
        int len = (int)Math.ceil(size);
        int[] answer = new int[len];
            
        int j=0;
        for(int i=0; i<len; i++,j+=n){
        answer[i] = num_list[j];    
        }
       return answer;
    }
}

// 길이를 구한다.
// 길이를 나눈 값을 반올림한다.(나누어 떨어지지 않는 경우가 있기때문이다.)
// n -> num_list [원소 0, 0+n, ~ 마지막] 
