class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum =0;
        
        if(arr1.length > arr2.length) return 1;
        else if(arr1.length == arr2.length){       
          for(int i=0; i<arr1.length; i++){
             sum += arr1[i]-arr2[i];
           }
          return (sum>0)?1:(sum==0)?0:-1;  
        }
        else return -1;
    }
}