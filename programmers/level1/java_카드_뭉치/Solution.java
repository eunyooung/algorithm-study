package level1.java_카드_뭉치;

class Solution {
    
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int i1 = 0;
        int i2 = 0;
        int n1 = cards1.length;
        int n2 = cards2.length;
        
        for (int i = 0; i < goal.length; i++) {
            
            String goalCard = goal[i];
            
            if (i1 < n1 && goalCard.equals(cards1[i1])) {
                i1++;
            } else if (i2 < n2 && goalCard.equals(cards2[i2])) {
                i2++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}
