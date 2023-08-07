import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string.toLowerCase());
        
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        
        return new String(arr);
    }
}