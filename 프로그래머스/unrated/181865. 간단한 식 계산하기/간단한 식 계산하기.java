class Solution {
	    public int solution(String binomial) {
	        
	        binomial = binomial.replace(" ","");
	        String[] arr = binomial.split("[\\+\\-\\*]");
	        int a = Integer.parseInt(arr[0]);
	        int b = Integer.parseInt(arr[1]);
	        
	        return (binomial.contains("+")) ? a+b : (binomial.contains("-"))? a-b : a*b;      
	    }
}