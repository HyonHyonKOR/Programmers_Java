import java.util.Arrays;   //무조건 Arrays를 import해야 사용 가능

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);    //객체 생성없이 바로 static 메소드 sort로 오름차순 정렬 가능
        int[] answer = new int[5];        
        System.arraycopy(num_list,0,answer,0,5);      
        return answer;
    }
}