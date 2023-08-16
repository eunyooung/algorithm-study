package level1.java_크기가_작은_부분문자열;

class Solution {
    
    public int solution(String t, String p) {
        
        int answer = 0;
        
        int tLength = t.length();
        int pLength = p.length();
        
        long newP = Long.parseLong(p);
        
        for (int i = 0; i <= tLength - pLength; i++) {
            /*
                p 의 길이는 최대 18
                int 의 최대 자리수는 10 이므로 long 사용
            */
            long num = Long.parseLong(t.substring(i, i + pLength));
            
            if (num <= newP) {
                answer++;
            }
        }
        
        return answer;
    }
}
