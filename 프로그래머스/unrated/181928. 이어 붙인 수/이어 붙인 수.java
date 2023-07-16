class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddSum = "";
        String evenSum ="";

        for(int i=0; i < num_list.length; i++){
          if(num_list[i]%2==1)
           oddSum += String.valueOf(num_list[i]);
          else    
           evenSum += String.valueOf(num_list[i]);      
        }
        answer = Integer.parseInt(oddSum)+ Integer.parseInt(evenSum);
        return answer;
    }
}