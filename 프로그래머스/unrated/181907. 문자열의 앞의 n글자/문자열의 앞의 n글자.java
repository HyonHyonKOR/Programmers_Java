class Solution {
    public String solution(String my_string, int n) {
        String answer="";
        if(my_string.length()>=1&&my_string.length()>=n&&my_string.length()<=1000)
        {answer =my_string.substring(0,n);}         
        return answer;
    }
}