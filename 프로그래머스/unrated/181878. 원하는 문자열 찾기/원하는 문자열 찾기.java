class Solution {
    public int solution(String myString, String pat) {
        
        String a = myString.toUpperCase();
        String b = pat.toUpperCase();
        
        return a.contains(b)?1:0;
            

    }
}