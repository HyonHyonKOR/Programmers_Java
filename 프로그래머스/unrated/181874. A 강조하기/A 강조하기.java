class Solution {
    public String solution(String myString) {

        String answer = myString.toLowerCase();
        return answer.replace("a","A");
    }
}
// a -> A
// X>A && X<=Z -> X+32