package level0.java_원소들의_곱과_합;

class Solution {
    
    public int solution(int[] num_list) {
        
        int products = 1;
        int sum = 0;
        
        for (int num : num_list) {
            products *= num;
            sum += num;
        }
        
        return products < sum * sum ? 1 : 0;
    }
}
