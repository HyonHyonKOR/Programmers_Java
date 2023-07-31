class Solution {
    public int[] solution(int[] numbers, String direction) {
        int size = numbers.length;
        int[] answer = new int[size];
            
        if(direction.equals("right")) {
            System.arraycopy(numbers,size-1,answer,0,1);
            System.arraycopy(numbers,0,answer,1,size-1);
        }   
        
        else {
            System.arraycopy(numbers,1,answer,0,1);
            System.arraycopy(numbers,2,answer,1,size-2);
            answer[size-1] = numbers[0];
        }    
            
        return answer;
    }
}