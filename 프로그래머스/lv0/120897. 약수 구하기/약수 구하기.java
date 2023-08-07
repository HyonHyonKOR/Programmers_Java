import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int i =  1;
        while(n>=i){
           if(n%i*i==0) list.add(i);  
           i++; 
        }
        
        int[] answer = new int[list.size()];
        
        for(int j=0; j<answer.length; j++){
            answer[j] = list.get(j).intValue();
        }
        
        return answer;
    }
}