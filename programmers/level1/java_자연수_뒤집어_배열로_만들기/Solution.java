package level1.java_자연수_뒤집어_배열로_만들기;

class Solution {
    
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        
        for (int i = str.length() - 1; i >= 0; i--) {
            
            char chr = str.charAt(str.length() - i - 1);
            answer[i] = chr - '0';
        }
        
        return answer;
    }
}
