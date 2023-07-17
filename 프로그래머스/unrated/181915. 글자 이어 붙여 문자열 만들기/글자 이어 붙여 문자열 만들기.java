class Solution {
    public String solution(String my_string, int[] index_list) {        
        String answer = "";
    
        for(int count: index_list){
          answer += my_string.charAt(count);
        }        

        return answer;
    }
}

//my_string의 값을 index_list의 길이번 반복해서, my_string의 index (index_list의 값)에서 추출 후, 
//String answer에 붙인다 