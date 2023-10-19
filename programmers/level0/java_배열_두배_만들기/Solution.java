package level0.java_배열_두배_만들기;

class Solution {
    
    public int[] solution(int[] numbers) {
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        
        return numbers;
    }
}
