class Solution {
    public String solution(String my_string, int s, int e) {
    
    StringBuilder sb = new StringBuilder(my_string);
	String change = sb.substring(s,e+1);
	sb.setLength(0);
	change = sb.append(change).reverse().toString();
	sb.setLength(0);

	return sb.append(my_string).replace(s,e+1,change).toString();
    }
}