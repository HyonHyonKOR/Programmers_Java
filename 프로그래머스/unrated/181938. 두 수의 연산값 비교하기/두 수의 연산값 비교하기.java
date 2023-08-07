class Solution {
    public int solution(int a, int b) { 
        int answer = Integer.parseInt(a + "" + b);
        return (Integer.parseInt(a+""+b) >= 2*a*b)? answer :2*a*b;
    }
}