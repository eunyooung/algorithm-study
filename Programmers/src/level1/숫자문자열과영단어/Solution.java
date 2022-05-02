package level1.숫자문자열과영단어;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        
        answer = Integer.valueOf(s);
        return answer;
    }
}