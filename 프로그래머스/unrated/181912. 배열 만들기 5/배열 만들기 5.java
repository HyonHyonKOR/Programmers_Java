import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            sb.append(intStrs[i].substring(s,s+l));
            String idx = sb.toString();
            int num = Integer.parseInt(idx);
            if(num > k) 
            list.add(num);
            sb.setLength(0);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
             answer[i] = list.get(i);   
        }
        return answer;
    }
}