class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int idx = 0;
        String arr[] = new String[j-i+1];
        
        for(int start =i; start<= j; start++){
           arr[idx] = start+"";
             for(int start2=0; start2 < arr[idx].toCharArray().length; start2++) {
            	 if(k+48 == arr[idx].charAt(start2)) {
            		 answer++;
            	 }
             }
           idx++;   
        }
        
        return answer;
    }
}

