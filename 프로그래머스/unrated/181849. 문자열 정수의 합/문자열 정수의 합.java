class Solution {
    public int solution(String num_str) {
        int result  = 0;
        char[] ch = num_str.toCharArray();
        for(int i=0; i<ch.length; i++){
            String a = String.valueOf(ch[i]);  
            int b  = Integer.parseInt(a);
            result += b;
        }
       return result;
    }
}