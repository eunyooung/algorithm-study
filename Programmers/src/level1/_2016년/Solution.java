package level1._2016년;

class Solution {
    
    public String solution(int a, int b) {
        String answer = "";
        
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int all = 0;
        for (int i = 0; i < a - 1; i++) {
            all += months[i];
        }
        all += b - 1;
        answer = days[all%7];
        
        return answer;
    }
}