class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0]>0) 
          return answer = (dot[1]>0)?1:4;

        else 
          return answer = (dot[1]<0)?3:2;
    }
}