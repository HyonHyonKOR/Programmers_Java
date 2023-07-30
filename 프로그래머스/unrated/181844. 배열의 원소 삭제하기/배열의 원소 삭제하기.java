import java.util.*;
    
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
                
        ArrayList<Integer> yes = new ArrayList<>();
        
        for(int i=0; i <arr.length; i++){
            yes.add(arr[i]); 
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                  yes.remove(Integer.valueOf(arr[i]));  
                  break;  
                }
            }
        }
        
        int[] answer = new int[yes.size()];
        
        for(int i=0; i < answer.length; i++){
            answer[i] = yes.get(i);            
        }
        
        return answer;
    }
}