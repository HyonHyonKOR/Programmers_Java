import java.text.DecimalFormat;

class Solution {
    public String solution(String n_str) {
        double a = Double.parseDouble(n_str);
        DecimalFormat df = new DecimalFormat("#");
        String answer = df.format(a);
        return answer;
    }
}