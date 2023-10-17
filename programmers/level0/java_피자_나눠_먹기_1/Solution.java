package level0.java_피자_나눠_먹기_1;

class Solution {
    
    public int solution(int n) {
        
        return n > 1 && n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}
