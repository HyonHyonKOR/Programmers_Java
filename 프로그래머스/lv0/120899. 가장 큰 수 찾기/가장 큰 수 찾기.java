import java.util.Arrays;

class Solution {
    int[] answer = new int[2];
    
    public int[] solution(int[] array) {
        int[] num = array.clone();
        Arrays.sort(num);

        answer[0] = num[array.length-1];
        answer[1] = binSearch(array);
        
        return answer;
    }
      public int binSearch(int[] array){
      int start = 0;    
      int last = array.length-1;    
      while(start<=last){
          int center = (start+last)/2;
          if(array[center] == answer[0]) return center;
          else if(array[center] > answer[0]) last = center-1; 
          else start = center+1;         
        }
          return -1;
      }    
}