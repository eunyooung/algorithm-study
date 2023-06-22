package level1.java_2016년;

class Solution {
    
    public String solution(int a, int b) {
                
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int all = 0;
        
        for (int i = 0; i < a - 1; i++) {
            all += months[i];
        }

        all += b - 1;
        
        return days[all%7];
    }
}