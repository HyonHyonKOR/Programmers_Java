import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
    
        LinkedList<String> list = new LinkedList<>(Arrays.asList(strArr));
    
        for(int i=0; i <strArr.length; i++){
           if(strArr[i].contains("ad"))
           list.remove(strArr[i]);
        }
        
        return list.toArray(new String[list.size()]);
    }
}