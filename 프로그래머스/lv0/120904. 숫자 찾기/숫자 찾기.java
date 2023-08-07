class Solution {
    public int solution(int num, int k) {
        String str = num + "";
        int answer = str.indexOf(k+"")+1;
        return (answer> 0)? answer:-1;
    }
}