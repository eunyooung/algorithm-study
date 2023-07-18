package level1.java_나머지가_1이_되는_수_찾기;

class Solution {
    
    public int solution(int n) {
        
        int answer = 1;
        
        while(n % answer != 1) {
            
            answer++;
        }
        
        return answer;
    }
}