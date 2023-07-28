class Solution {
    public String solution(String rsp) {
        
         
        rsp = rsp.replace("2","영").replace("0","오").replace("5","이");
            
        return rsp.replace("영","0").replace("오","5").replace("이","2");
    }
}