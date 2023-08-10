class Solution {
    public int solution(int[] date1, int[] date2) { 
        
      int yearGap = date2[0] - date1[0];
      int monthGap = date2[1] - date1[1];
      int dayGap = date2[2] - date1[2];  
          
      if(yearGap > 0) return 1;
      else if (yearGap == 0 && monthGap > 0) return 1;
      else if (yearGap == 0 && monthGap == 0 && dayGap > 0) return 1;  
      else return 0; 
    }
    
}