package level2.java_다음_큰_숫자;

class Solution {
    
    public int solution(int n) {
        
        int num = Integer.bitCount(n);
        
        while(true) {
            
            n++;
            
            int num_ = Integer.bitCount(n);
            
            if (num == num_) {
                break;
            }
            
        }
        
        return n;
    }
}
