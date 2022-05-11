package level1.완주하지못한선수;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if (answer.isEmpty()) {
            answer = participant[i];
        }
        return answer;
    }
}