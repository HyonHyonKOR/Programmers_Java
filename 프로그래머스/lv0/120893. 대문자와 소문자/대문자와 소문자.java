class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>='a' && arr[i]<='z') arr[i] -= 32; 
            else arr[i] += 32; 
        }    
        
        return String.valueOf(arr);
    }
}