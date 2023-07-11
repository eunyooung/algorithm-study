package level1.java_자릿수_더하기;

public class Solution {
    
    public int solution(int n) {
        int answer = 0;
        
        for (String num : Integer.toString(n).split("")) {
            answer += Integer.parseInt(num);
        }

        return answer;
    }
}
