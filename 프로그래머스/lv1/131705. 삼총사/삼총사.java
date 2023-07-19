class Solution {
    public int solution(int[] number) {
        
        int n = number.length;
        int answer = 0;
        
        for(int i=0; i<=n-3; i++){
            for(int j=i+1; j<=n-2;j++){
                for(int k=j+1; k<=n-1;k++){
                    
                  if(number[i]+number[j]+number[k]==0) 
                      answer++;   //012  013 014 
                    
                }
                
            }
                
        }
            
        return answer;
    }
}


//012 013 014 023 024 034      
//123 124 134 
//234