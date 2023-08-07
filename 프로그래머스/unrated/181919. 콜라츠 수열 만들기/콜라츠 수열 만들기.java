import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    
    ArrayList<Integer> list = new ArrayList<>();
    
    public int[] solution(int n) {
        list.add(n);
        
        while(n!=1){
           if(n%2==0){
             n/=2;
             list.add(n);
           }else{
             n = 3*n+1;
             list.add(n);  
           }  
        }
         
        return list.stream().mapToInt(i -> i).toArray();
    }
}