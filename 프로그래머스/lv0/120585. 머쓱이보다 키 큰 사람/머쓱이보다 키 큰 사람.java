import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        
        Arrays.sort(array);
              
        int answer = 0;
        int count = 0;
        
        for(int i=array.length-1; i+1>0; i--)
        {  if(height >= array[i]){
            break;
        }
            answer++;
        }
        
        return answer;
    }
}