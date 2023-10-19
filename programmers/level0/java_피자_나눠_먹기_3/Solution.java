package level0.java_피자_나눠_먹기_3;

class Solution {
    
    public int solution(int slice, int n) {
        
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}