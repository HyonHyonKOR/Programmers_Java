class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
         StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<todo_list.length; i++){
          if(!finished[i]) {
        	  sb.append(todo_list[i]+",");  
          }
        
       }
        return sb.toString().split(",");
    }
}