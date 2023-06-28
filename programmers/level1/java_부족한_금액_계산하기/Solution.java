package level1.java_부족한_금액_계산하기;

class Solution {
    
    public long solution(int price, int money, int count) {
        long answer = 0;
    
        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }
        answer -= money;
        
        return answer < 0 ? 0 : answer;
    }
}