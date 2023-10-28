package level0.java_아이스_아메리카노;

class Solution {
    
    public int[] solution(int money) {
        
        int count =  0;
        
        while (money >= 5500) {
            
            money = money - 5500;
            count++;
        }
        
        return new int[] {count, money};
    }
}
