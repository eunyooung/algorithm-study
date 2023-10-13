package level0.java_두_수의_나눗셈;

class Solution {
    
    public int solution(int num1, int num2) {
        
        return num2 == 0 ? 0 : (int) ((double) num1 / num2 * 1000);
    }
}
