class Solution {
    public int solution(int a, int b, int c) {
    
    int answer = 0;
    int count = 0;    
    int[] arr = {a,b,c};
    
    if(arr[0]==arr[1]) count++; 
    if(arr[1]==arr[2]) count++; 
    if(arr[2]==arr[0]) count++;   
     
    int x = a+b+c;    
    int y = x * (a*a + b*b + c*c);
    int z = 3*a*3*(a*a)*3*(a*a*a);      

    switch(count){
        case 0 : answer = x; break;
        case 1 : answer = y; break; 
        case 3 : answer = z; break;    
    } 
    return answer;    
  }      
}