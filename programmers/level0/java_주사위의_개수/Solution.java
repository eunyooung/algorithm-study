package level0.java_주사위의_개수;

class Solution {
    
    public int solution(int[] box, int n) {
        
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
