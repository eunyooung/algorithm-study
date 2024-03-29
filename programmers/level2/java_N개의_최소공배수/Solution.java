package level2.java_N개의_최소공배수;

class Solution {
    
    // 유클리드 호제법
    public static int calGcd(int a, int b){
        
        int x = Math.max(a,b);
        int y = Math.min(a,b);
        
        while(x % y != 0) {
            
            int r = x % y;
            x = y;
            y = r;
        }
        
        return y;
    }
    
    public int solution(int[] arr) {
        
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            
            int gcd = calGcd(answer,arr[i]);
            answer = answer * arr[i] / gcd;
        }
        
        return answer;
    }
}