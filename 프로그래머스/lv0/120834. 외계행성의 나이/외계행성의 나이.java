class Solution {
    public String solution(int age) {
    
        String temp = Integer.toString(age);
         
        char[] array = temp.toCharArray();
        
        for(int i=0; i<array.length; i++){
            array[i] = (char)(array[i] + 49);
        }        
        
        return new String(array);
    }
}