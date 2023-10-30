package level0.java_옷가게_할인_받기;

class Solution {
    
    public int solution(int price) {
        
        if (price < 100000) {
            
            return price;
            
        } else if (price < 300000) {
            
            return (int) (price * 0.95);
            
        } else if (price < 500000) {
            
            return (int) (price * 0.90);
            
        } else {
            
            return (int) (price * 0.8);
        }
    }
}
