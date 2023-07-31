package level1.java_하샤드_수;

class Solution {
    
    public boolean solution(int x) {
        
        int x2 = x;
        int sum = 0;
        
        while (x2 != 0) {
            
            sum += x2 % 10;
            
            x2 /= 10;
        }
        
        return x % sum == 0 ? true : false;
    }
}
