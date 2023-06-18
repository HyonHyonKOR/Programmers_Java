class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean even = (n>0 && n<=1000 && n%2==0);
        if(even) answer=(n/2)*((n/2)+1);
        else answer=((n-1)/2)*(((n-1)/2)+1);
        return answer;  
      }          
    }
