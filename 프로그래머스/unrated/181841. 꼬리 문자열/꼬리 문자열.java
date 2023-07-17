class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(String yes :str_list){
            if(yes.contains(ex)){
                continue;
            }
            answer += yes;       
        }
        return answer;
    }
}


