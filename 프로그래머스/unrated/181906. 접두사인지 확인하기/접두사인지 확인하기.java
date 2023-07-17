class Solution {
    public int solution(String my_string, String is_prefix) {
        int count = 0;
        
        for(int i=0; i< is_prefix.length(); i++){
           if(is_prefix.length() <= my_string.length()){
             if(my_string.charAt(i) == is_prefix.charAt(i)){
              count++;    
             }   
           }           
        }   
        return (count> 0 && count==is_prefix.length())? 1:0;
    }
}



//for -> 0번 인덱스 
//is_prefix의 0부터 마지막까지 일치  