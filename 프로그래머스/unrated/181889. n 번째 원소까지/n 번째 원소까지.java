class Solution {
    public int[] solution(int[] num_list, int n) {
         int[] copy_list = new int[n];  
         System.arraycopy(num_list,0,copy_list,0,n);
         return copy_list;
    }
}