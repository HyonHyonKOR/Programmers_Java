class Solution {
    public int solution(int a, int b) {
       int answer =0; 
        
       String x = a+""+b;
       String y = b+""+a;
    
       int aA = Integer.parseInt(x); 
       int bB = Integer.parseInt(y);
        
       Math.max(aA,bB); 
        
       if(aA==bB)  return aA;
       else return Math.max(aA,bB); 
    }
}