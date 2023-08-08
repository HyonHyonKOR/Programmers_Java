class Solution {
      
    public int solution(int n) {
        
        boolean prime[] = new boolean[n+1];
        
        int answer = 0;
        
        prime[0] = prime[1] = true;
        
        for(int i=2; i*i<=n; i++){
          for(int j=i*i; j<=n; j+=i){
            if(!prime[i]) prime[j] = true;
            }
          }
        
        for(int i=2; i<=n; i++){
           if(prime[i]) answer++;            
        } 
        
        return answer;
      }
}