package level1.신규아이디추천;
import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        answer = answer.replace("..",".");
        while(true) {
            if (answer.startsWith(".")) {
                answer = answer.substring(1, answer.length());
            } else if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length()-1);
            } else if (answer.contains("..")) {
                answer = answer.replace("..",".");
            } 
            else {
                if(answer.equals("")) {
                    answer = "a";
                }
                break;
            }
        }
        
        if (answer.length() >= 16) {
            answer = answer.substring(0,15);
            while(true) {
                if (answer.endsWith(".")) {
                    answer = answer.substring(0, answer.length()-1);
                } else if(answer.equals("")) {
                        answer = "a";
                }
                break;
            }
        }
        while (answer.length() <= 2) {
            char temp = answer.charAt(answer.length()-1);
            answer += temp;
        } 
        return answer;
    }
}