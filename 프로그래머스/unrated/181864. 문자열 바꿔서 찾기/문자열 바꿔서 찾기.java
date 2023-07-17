class Solution {
    public int solution(String myString, String pat) {        
        String result = myString.replace("A","X").replace("B", "A").replace("X", "B");
        return (result.contains(pat))?1:0;     
    }
}