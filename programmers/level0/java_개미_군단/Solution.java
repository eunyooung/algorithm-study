package level0.java_개미_군단;

class Solution {
    
    public int solution(int hp) {
        
        return hp / 5 + hp % 5 / 3 + hp % 5 % 3;
    }
}
