class Solution {
    public int solution(int n) {
        if(n % 6 == 0) return (n / 6);    
        else if( n % 2 == 0) return ((n * 6) / 2 / 6);
        else if( n % 3 == 0) return ((n * 6) / 3 / 6);
        else return (6 * n / 6);
      }   
}



