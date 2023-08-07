package level1.java_최대공약수와_최소공배수;

class Solution {
    
    public int[] solution(int n, int m) {
        
        int[] answer = new int[2];
        
        for (int i = n; i >= 1; i--) {
            
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        int count = 1;
        
        while (true) {
            int current = m * count;
            if (current % m == 0 && current % n == 0) {
                answer[1] = current;
                break;
            }
            count++;
        }
        
        return answer;
    }
}
