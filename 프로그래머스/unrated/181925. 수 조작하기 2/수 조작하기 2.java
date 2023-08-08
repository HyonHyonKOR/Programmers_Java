class Solution {
    public String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();
        
        for(int i=1; i< numLog.length; i++){
          int key = numLog[i]-numLog[i-1];
          if(key>0){
             if(key==10) result.append("d"); 
             else result.append("w");
          }
          else if(key<0){
              if(key==-10) result.append("a");
              else result.append("s");
          }  
        }
        
        return result.toString();
    }
}