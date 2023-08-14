import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
         char[] bf = before.toCharArray();      
         char[] af = after.toCharArray();
        
         Arrays.sort(bf);
         Arrays.sort(af);
        
         String bef = new String(bf);
         String aft = new String(af);
        
          return (bef.compareTo(aft) == 0) ? 1:0;
        }
    }
