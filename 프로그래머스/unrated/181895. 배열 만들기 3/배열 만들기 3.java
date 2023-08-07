class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
                
        int first = intervals[0][1] - intervals[0][0] + 1;
        int last  = intervals[1][1] - intervals[1][0] + 1;   
        
        int[] answer = new int[first + last];
        
        System.arraycopy(arr,intervals[0][0],answer,0, first);
        System.arraycopy(arr,intervals[1][0],answer, first, last);
            
        return answer;
    }
}